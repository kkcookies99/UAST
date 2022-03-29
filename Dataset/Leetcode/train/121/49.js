 var XXX = function(prices) {
    if(!prices.length){
        return 0;
    }
    let minPrice = prices[0],XXX = 0;
    for(let i = 1;i < prices.length;i++){
        if(minPrice > prices[i]){
            minPrice = prices[i];
        }else{
            XXX = Math.max(XXX,prices[i] - minPrice);
        }
    }
    return XXX;
};

