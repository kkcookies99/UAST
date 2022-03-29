 var XXX = function(prices) {
  let max = 0
  let min = prices[0]
  for(let i=1;i<prices.length;i++){
    min = Math.min(min,prices[i])
    if(prices[i]-min>max){
      max = prices[i]-min
    }
  }
  return max
};

