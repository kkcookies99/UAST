var XXX = function(l1, l2,add) {
    const { val: l1value, next: l1next } = l1 || { }
    const { val: l2value, next: l2next } = l2 || { }
    const reduceList = [l1value,l2value].filter(v=>(typeof v === 'number'))
    if(reduceList.length || add){
        const value = reduceList.reduce((a,b) => a+b, add || 0)
        const nextAdd = Math.floor(value / 10)
        return { 
            val:value % 10,
            next:XXX(l1next,l2next,nextAdd)
        }
    }
};

