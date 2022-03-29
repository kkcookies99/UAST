 var XXX = function(prices) {
    let min = prices[0],
        res = 0;
    for(let i = 0; i < prices.length; i++){
        min = Math.min(min,prices[i]);
        res = Math.max(prices[i] - min,res);
    }
    return res;
};

