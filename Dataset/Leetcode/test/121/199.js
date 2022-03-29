 var XXX = function(prices) {
    var max = 0;
    var left = 0;
    var right = 1;
    while(right < prices.length) {
        if(prices[left] >= prices[right]) {
            left = right++;
        } else {
            max = Math.max(max, prices[right++] - prices[left]);
        }
    }
    return max
};

