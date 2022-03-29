 var XXX = function(prices) {
  let min = prices[0], XXX = 0
  for (let i = 1; i < prices.length; i++) {
    if (prices[i] < min) min = prices[i]
    else XXX = Math.max(XXX, prices[i] - min)
  }
  return XXX
};

