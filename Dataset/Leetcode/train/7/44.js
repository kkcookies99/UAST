var XXX = function(x) {

    const symbol = String(x).split("").XXX().join("")
    let result;
    if(x>=0){
     result =  Number(symbol) 
    }else{
     result = Number(symbol.slice(-1)+symbol.slice(0,-1)) 
    }
    if(result < (-2)**31 || result > (2**31 -1)){
        result = 0
    }
    return result
}

