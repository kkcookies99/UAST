 var XXX = function(prices) {
    const res = [];
    let min = prices[0] || 0;
     
    prices.forEach((i, index) => {
        if(i < min) min = i;
        
        if(index === 0){
          res[0] = 0; 
        } else {
          res[index] = Math.max(res[index - 1], i - min);             
        }
         
    })
    
    return Math.max(...res, 0);
};

