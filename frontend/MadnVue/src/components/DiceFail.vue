<script>
export default {
    name: 'DiceFail',
    components: {
    },
    data(){
        return {
        }
    },
    methods: {
        confirm() {
            this.$emit('confirm')
        }
    },
    props: {
        diceValue: Number
    },
}
</script>



<template>
<div class="card">
    <div class="card-body">
        <h3>{{diceValue}} gewürfelt</h3>
        <button class="btn btn-primary" @click="confirm">Nochmal Würfeln</button>
    </div>
</div>
</template>


<style scoped>
div {
    width: 200px;
    height: 300px;
    background:red ;
}
</style>