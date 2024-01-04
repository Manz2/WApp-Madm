
<script>
export default {
  name: 'BoardCell',
  props: {
    hidden: Boolean,
    text: {
      type: String,
      default: ''
    },
    color: {
      type: String,
      default: ''
    }
  },
  methods: {
  },
  computed: {
    _color () {
      if (this.color !== '') {
        switch (this.color) {
          case 'B': return '#FF0000'
          case 'A': return '#009DFF'
          case 'D': return '#FFFC00'
          case 'C': return '#00BF02'
          default: return 'pink'
        }
      }
      if (this.hidden) {
        return 'FFFEBA'
      }
      if (this.text === '') {
        return 'white'
      }
      const player = this.text.charAt(0)
      switch (player) {
        case 'A': return '#009DFF'
        case 'B': return '#FF0000'
        case 'C': return '#FFFC00'
        case 'D': return '#00BF02'
        default: return 'pink'
      }
    }
  },
  created () {
  }
}
</script>

<template>
    <div class="grid-item" :class="{ hidden: hidden }" :style="{ backgroundColor: _color }">
    {{ text }}
    </div>
</template>

<style scoped>
.grid-item {
    width: 30px;
    height: 30px;
    border: 1px solid #000; /* Rand um jede Zelle */
    text-align: center;
    line-height: 30px;
    font-size: 14px;
    border-radius: 99%;
    background: #FFFFFF;
}
.grid-item:hover {
    background: #40488F;
    cursor: pointer;
    border: solid white 1px;
}
.hidden {
    border: none;
    background: #FFFEBA;;
}
.hidden:hover {
    border: none;
    cursor: default;
    background: #FFFEBA;;
}

</style>
