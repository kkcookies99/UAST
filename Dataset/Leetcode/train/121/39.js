 var XXX = function(prices) {
    //
    let len=prices.length
    let min=Number.MAX_VALUE
    let max=0
    for(let i=0;i<len;i++){
        if(prices[i]<min){
            min=prices[i]  
        }
        else{
            max=Math.max(prices[i]-min,max)
        }
    }
    return max
};

