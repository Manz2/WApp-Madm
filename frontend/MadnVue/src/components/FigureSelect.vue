
<script>
export default {
    name: 'FigureSelect',
    components: {
    },
    data(){
        return {
            figureSelected: 0
        }
    },
    methods: {
        confirm() {
            this.$emit('assignFigure', this.figureSelected)
        }
    },
}
</script>


<template>
<div class="card">
    <div class="form-group card-body">
            <label for="figur">Mit welcher Figur willst du Fahren</label>
            <select name="figur" class="form-control" id="figure-select" v-model="figureSelected">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
            </select>
            <button id="figure-button" class="btn btn-primary" @click="confirm">Fahren</button>
            <div id="box-dynamic"><img class="img-dynamic" id="dice-image" src="" alt="one" /></div>
    </div>
</div>
</template>


<style scoped>
.card {
    width: 300px;;
    height: 200px;
}
</style> 