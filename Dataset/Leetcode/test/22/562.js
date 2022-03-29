 var XXX = function(n) {
    let tmp = ['()']
    if(n===1) return tmp
    while(n>1){
        tmp = getTmp(tmp)
        n--
    }
    return tmp
};

let getTmp = (t)=>{
    let tmp = []
    for (let i=0;i<t.length;i++){
        for (let j=0;j<=t[i].length;j++){
        tmp.push(t[i].slice(0,j)+'()'+t[i].slice(j,t[i].length))
        }
    }
    return Array.from(new Set(tmp))
}

