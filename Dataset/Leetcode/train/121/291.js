 var XXX = function(prices) {
    let p = 0, sum = 0;
    for (let i = 1; i < prices.length; i++) {
        if (prices[i] - prices[p] < 0) {
            p = i;
        }
        sum = Math.max(prices[i] - prices[p], sum);
    }
    return sum;
};