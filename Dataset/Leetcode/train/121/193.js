 var XXX = function(prices) {
    let minP = prices[0]
    let maxP = 0
    let i = 0
    while (i < prices.length) {
        minP = Math.min(minP, prices[i])
        maxP = Math.max(maxP, prices[i] - minP)
        i++
    }
    return maxP
};

