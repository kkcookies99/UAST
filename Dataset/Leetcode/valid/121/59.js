 var XXX = function(prices) {
    let res = 0;
    let min = prices[0];
    for(let i = 1; i < prices.length; i++) {
        res = Math.max(res, prices[i] - min);
        min = Math.min(min, prices[i]);
    }
    return res;
};

