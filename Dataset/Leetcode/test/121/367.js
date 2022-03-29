 var XXX = function(prices) {
   
    for (var i = 0; i < prices.length - 1; i++) {
        prices[i] -= prices[i + 1]
    }
    prices.pop();

    var min = tempMin = prices[0];
    for (var j = 1; j < prices.length; j++) {
        tempMin = Math.min(prices[j] + tempMin, prices[j])
        min = Math.min(min, tempMin);
    }
    
    return (-min)>0?(-min):0;
};

