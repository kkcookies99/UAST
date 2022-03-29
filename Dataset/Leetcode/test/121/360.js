 var XXX = function(prices) {
    let max = 0;
    let minPrice = prices[0];//变量minPrice为当前最低的价格
    for(let i=1; i<prices.length; i++) {
        minPrice = Math.min(minPrice, prices[i]);
        // 每一天的利润最大化 = 前一天的利润最大化 || (今天的价格 - 这几天的最小值)
        max = Math.max(max, prices[i] - minPrice);
    }
    return max;
};

