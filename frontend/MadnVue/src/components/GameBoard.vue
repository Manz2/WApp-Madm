
<script>
import BoardCell from "./BoardCell.vue";
import axios from "axios";
export default {
  name: "GameBoard",
  components: {
    BoardCell,
  },
  props: {
    field: Object,
  },
  
};
</script>

<template>
  <div class="grid-container">
    <BoardCell :text="field.p1.home[0]" :hidden="false" />
    <BoardCell :text="field.p1.home[1]" :hidden="false" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.free[8]" :hidden="false" />
    <BoardCell :text="field.free[9]" :hidden="false" />
    <BoardCell :text="field.free[10]" :hidden="false" color="B" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.p2.home[0]" :hidden="false" />
    <BoardCell :text="field.p2.home[1]" :hidden="false" />

    <BoardCell :text="field.p1.home[2]" :hidden="false" />
    <BoardCell :text="field.p1.home[3]" :hidden="false" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.free[7]" :hidden="false" />
    <BoardCell :text="field.p2.final[0]" :hidden="false" color="B" />
    <BoardCell :text="field.free[11]" :hidden="false" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.p2.home[2]" :hidden="false" />
    <BoardCell :text="field.p2.home[3]" :hidden="false" />

    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="A" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.free[6]" :hidden="false" />
    <BoardCell :text="field.p2.final[1]" :hidden="false" color="B" />
    <BoardCell :text="field.free[12]" :hidden="false" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="B" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />

    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.free[5]" :hidden="false" />
    <BoardCell :text="field.p2.final[2]" :hidden="false" color="B" />
    <BoardCell :text="field.free[13]" :hidden="false" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />

    <BoardCell :text="field.free[0]" :hidden="false" color="A" />
    <BoardCell :text="field.free[1]" :hidden="false" />
    <BoardCell :text="field.free[2]" :hidden="false" />
    <BoardCell :text="field.free[3]" :hidden="false" />
    <BoardCell :text="field.free[4]" :hidden="false" />
    <BoardCell :text="field.p2.final[3]" :hidden="false" color="B" />
    <BoardCell :text="field.free[15]" :hidden="false" />
    <BoardCell :text="field.free[15]" :hidden="false" />
    <BoardCell :text="field.free[16]" :hidden="false" />
    <BoardCell :text="field.free[17]" :hidden="false" />
    <BoardCell :text="field.free[18]" :hidden="false" />

    <BoardCell :text="field.free[39]" :hidden="false" />
    <BoardCell :text="field.p1.final[0]" :hidden="false" color="A" />
    <BoardCell :text="field.p1.final[1]" :hidden="false" color="A" />
    <BoardCell :text="field.p1.final[2]" :hidden="false" color="A" />
    <BoardCell :text="field.p1.final[3]" :hidden="false" color="A" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.p4.final[3]" :hidden="false" color="C" />
    <BoardCell :text="field.p4.final[2]" :hidden="false" color="C" />
    <BoardCell :text="field.p4.final[1]" :hidden="false" color="C" />
    <BoardCell :text="field.p4.final[0]" :hidden="false" color="C" />
    <BoardCell :text="field.free[19]" :hidden="false" />

    <BoardCell :text="field.free[38]" :hidden="false" />
    <BoardCell :text="field.free[37]" :hidden="false" />
    <BoardCell :text="field.free[36]" :hidden="false" />
    <BoardCell :text="field.free[35]" :hidden="false" />
    <BoardCell :text="field.free[34]" :hidden="false" />
    <BoardCell :text="field.p3.final[3]" :hidden="false" />
    <BoardCell :text="field.free[24]" :hidden="false" />
    <BoardCell :text="field.free[23]" :hidden="false" />
    <BoardCell :text="field.free[22]" :hidden="false" />
    <BoardCell :text="field.free[21]" :hidden="false" />
    <BoardCell :text="field.free[20]" :hidden="false" color="C" />

    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.free[33]" :hidden="false" />
    <BoardCell :text="field.p3.final[2]" :hidden="false" color="D" />
    <BoardCell :text="field.free[25]" :hidden="false" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />

    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="D" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.free[32]" :hidden="false" />
    <BoardCell :text="field.p3.final[1]" :hidden="false" color="D" />
    <BoardCell :text="field.free[26]" :hidden="false" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="C" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />

    <BoardCell :text="field.p3.home[0]" :hidden="false" />
    <BoardCell :text="field.p3.home[1]" :hidden="false" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.free[31]" :hidden="false" />
    <BoardCell :text="field.p3.final[0]" :hidden="false" color="D" />
    <BoardCell :text="field.free[27]" :hidden="false" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.p4.home[0]" :hidden="false" />
    <BoardCell :text="field.p4.home[1]" :hidden="false" />

    <BoardCell :text="field.p3.home[2]" :hidden="false" />
    <BoardCell :text="field.p3.home[3]" :hidden="false" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.free[30]" :hidden="false" color="D" />
    <BoardCell :text="field.free[29]" :hidden="false" />
    <BoardCell :text="field.free[28]" :hidden="false" />
    <BoardCell text="" :hidden="true" />
    <BoardCell text="" :hidden="true" />
    <BoardCell :text="field.p4.home[2]" :hidden="false" />
    <BoardCell :text="field.p4.home[3]" :hidden="false" />
  </div>
</template>

<style scoped>
.container {
  text-align: center;
  margin: 0 auto;
  display: flex;
  flex-direction: row;
  justify-content: center;
}
.grid-container {
  display: grid;
  grid-template-columns: repeat(11, 30px);
  grid-gap: 10px;
  padding: 20px;
  background: #fffeba;
  border: solid red 1px;
  border-radius: 5%;
  box-shadow: red 0px 0px 4px;
}

/* CSS für die Zellen */
.grid-item {
  width: 30px;
  height: 30px;
  border: 1px solid #000; /* Rand um jede Zelle */
  text-align: center;
  line-height: 30px;
  font-size: 14px;
  border-radius: 99%;
  background: #ffffff;
}

.grid-item:hover {
  background: #40488f;
  cursor: pointer;
  border: solid white 1px;
}

.hidden {
  border: none;
  background: #fffeba;
}
.hidden:hover {
  border: none;
  cursor: default;
  background: #fffeba;
}
</style>