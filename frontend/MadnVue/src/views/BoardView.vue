<script>
import { RouterLink } from "vue-router";
import DiceFail from "../components/DiceFail.vue";
import FigureSelect from "../components/FigureSelect.vue";
import PlayerSelect from "../components/PlayerSelect.vue";
import GameBoard from "../components/GameBoard.vue";
import axios from "axios";
const range = (start, end, element) => {
  let array = [];
  for (let i = start; i <= end - 1; i++) {
    array.push(element);
  }
  return array;
};
const areAllValuesNotEmpty = (obj) => {
  return Object.values(obj).every((value) => value !== "");
};
const rollDice = () => {
  return Math.floor(Math.random() * 6) + 1;
};
const SECOND = 1000;
export default {
  name: "BoardView",
  components: {
    RouterLink,
    GameBoard,
    DiceFail,
    FigureSelect,
    PlayerSelect,
  },
  data() {
    return {
      pollingRef: null,
      pollingInterval: 1,
      socketActive: false,
      diceFailForm: false,
      diceValue: 0,
      playerForm: true,
      playerValue: null,
      figureForm: false,
      figureValue: null,
      fieldData: null,
      field: {
        p1: {
          home: range(0, 4, ""),
          final: range(0, 4, ""),
        },
        p2: {
          home: range(0, 4, ""),
          final: range(0, 4, ""),
        },
        p3: {
          home: range(0, 4, ""),
          final: range(0, 4, ""),
        },
        p4: {
          home: range(0, 4, ""),
          final: range(0, 4, ""),
        },
        free: range(0, 40, ""),
      },
    };
  },
  methods: {
    startPolling() {
      this.pollingRef = setInterval(
        this.fetchFromAPI,
        this.pollingInterval * SECOND
      );
    },
    stopPolling() {
      clearInterval(this.pollingRef);
      this.pollingRef = null;
    },
    startWS() {
      this.socketRef = new WebSocket("ws://localhost:9000/websocket");
      this.socketActive = true;
      this.socketRef.onopen = function (e) {
        console.log("[open] Connection established");
        this.socketActive = true;
      };
      this.socketRef.onmessage = function (event) {
        console.log(`[message] Data received from server: ${event.data}`);
      };
      this.socketRef.onerror = function (error) {
        console.log(`[error] ${error.message}`);
      };
      this.socketRef.onclose = function (event) {
        console.log(
          `[close] Connection closed cleanly, code=${event.code} reason=${event.reason}`
        );
        this.socketActive = false;
        console.log(this.socketActive);
      };
    },
    stopWS() {
      this.socketRef.close();
      this.socketRef = null;
      this.socketActive = false;
      console.log(this.socketActive);
    },
    retry() {
      console.log("retry");
      this.diceFailForm = false;
      this.playerForm = true;
    },
    assignPlayer(player) {
      console.log(player);
      this.diceValue = rollDice();
      if (this.diceValue != 6 && this.isFirstMove(player)) {
        this.playerForm = false;
        this.diceFailForm = true;
        return;
      }
      this.playerValue = player;
      this.playerForm = false;
      this.figureForm = true;
    },
    assignFigure(figure) {
      console.log(figure);
      this.figureValue = figure;
      this.figureForm = false;
      this.sendMove();
    },
    sendMove() {
      const payload = {
        player: this.playerValue,
        figure: this.figureValue.toString(),
        diceVal: this.diceValue.toString(),
      };
      axios
        .post("http://localhost:9000/fieldsJson", payload)
        .then((res) => {
          this.fetchFromAPI();
        })
        .catch((err) => console.log(err));
      this.playerForm = true;
    },
    isFirstMove(player) {
      console.log("isFirstMove");
      console.log(player);
      if (player == "A") {
        const relevatField = this.field.p1.home;
        return areAllValuesNotEmpty(relevatField);
      } else if (player == "B") {
        const relevatField = this.field.p2.home;
        return areAllValuesNotEmpty(relevatField);
      } else if (player == "C") {
        const relevatField = this.field.p3.home;
        return areAllValuesNotEmpty(relevatField);
      } else if (player == "D") {
        const relevatField = this.field.p4.home;
        return areAllValuesNotEmpty(relevatField);
      } else {
        return null;
      }
    },
    async fetchFromAPI() {
      console.log("fetch...");
      try{
      const res = await axios.get("http://localhost:9000/fieldsJson");
      if (res.status == 200) {
        const data = res.data;
        this.assignFromValues(data);
      }
      } catch(err){
        alert("Server nicht erreichbar")
        this.stopPolling()
      }
    },
    assignFromValues(fullBoardValues) {
      /* Player A -> P1 */
      /* Player B -> P2 */
      /* Player C -> P3 */
      /* Player D -> P4 */
      console.log("assignFromValues");
      const fieldField = fullBoardValues.fieldField;
      this.field.free = fieldField.slice(0, 40);

      /* HomeField -> FinalField */
      const finalField = fullBoardValues.homeField;
      const finalFieldA = finalField.slice(0, 4);
      this.field.p1.final = finalFieldA;
      const finalFieldB = finalField.slice(4, 8);
      this.field.p2.final = finalFieldB;
      const finalFieldC = finalField.slice(8, 12);
      this.field.p3.final = finalFieldC;
      const finalFieldD = finalField.slice(12, 16);
      this.field.p4.final = finalFieldD;

      /* PlayerField -> HomeField */
      const homeField = fullBoardValues.playerField;
      const homeFieldA = homeField.slice(0, 4);
      this.field.p1.home = homeFieldA;
      const homeFieldB = homeField.slice(4, 8);
      this.field.p2.home = homeFieldB;
      const homeFieldC = homeField.slice(8, 12);
      this.field.p3.home = homeFieldC;
      const homeFieldD = homeField.slice(12, 16);
      this.field.p4.home = homeFieldD;
    },
  },
  async created() {
    await this.fetchFromAPI();
  },
};
</script>


<template>
  <div>
    <h1>Mensch Ärgere dich nicht</h1>
    <div class="row connect">
      <div class="col-sm-6 mb-3 mb-sm-0 connect">
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">Websocket</h5>
            <p class="card-text">Get data from a websockt from the server</p>
            <button
              class="btn btn-primary"
              v-if="!socketActive"
              @click="startWS"
            >
              Start WS
            </button>
            <button class="btn btn-danger" v-else @click="stopWS">
              Stop WS
            </button>
          </div>
        </div>
      </div>
      <div class="col-sm-6 connect">
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">API-POLLING</h5>
            <p class="card-text">Poll data from Webserver</p>
            <input
              class="input"
              type="number"
              v-model="pollingInterval"
              step="0.1"
              max="10"
              min="0.1"
            />
            <input
              type="range"
              class="form-range"
              min="0.1"
              max="10"
              step="0.1"
              v-model="pollingInterval"
            />
            <button
              class="btn btn-primary"
              v-if="!pollingRef"
              @click="startPolling"
            >
              Start Polling
            </button>
            <button class="btn btn-danger" v-else @click="stopPolling">
              Stop Polling
            </button>
            <div id="polling-badge"></div>
          </div>
        </div>
      </div>
    </div>

    <div class="container">
      <GameBoard :field="field" />
      <DiceFail v-if="diceFailForm" :diceValue="diceValue" @confirm="retry" />
      <PlayerSelect v-if="playerForm" @assignPlayer="assignPlayer" />
      <FigureSelect v-if="figureForm" @assignFigure="assignFigure" />
    </div>
  </div>
</template>

<style scoped>
h1 {
  font-size: 3em;
  text-align: center;
  margin: auto auto;
  margin-top: 10%;
  margin-bottom: 10%;
}
.container {
  margin-top: 5%;
  display: flex;
  align-items: center;
  justify-content: center;
}
.container > * {
  margin-left: 5%;
  margin-right: 5%;
}
.card {
  width: 300px;
}

.connect {
  display: flex;
  justify-content: center;
}
</style>