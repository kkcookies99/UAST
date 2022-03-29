 var XXX = function(prices) {
    const n = prices.length;
    let res = Array.from({length: n}, () => []);

    for(let i=0; i<n; i++) {
        if(i==0) {
            res[i][0] = 0;
            res[i][1] = -prices[i];
            continue;
        }
        // 穷举每一天持有和卖出状态的收益
        res[i][0] = Math.max(res[i-1][0], res[i-1][1] + prices[i]);
        res[i][1] = Math.max(res[i-1][1], -prices[i]);
    }
    return res[n-1][0];
};

