     var XXX = function(prices) {
      if(prices.length===0){
        return 0;
      }
      //初始化最小价格为价格数组首元素,初始化最大利润为0;
      let minprice =prices[0],XXX = 0;
     //遍历整体价格数组
      for(let i = 0; i <prices.length; i++){
          if(prices[i] <minprice){
            minprice = prices[i];
          }else if(prices[i] - minprice > XXX){
                XXX = prices[i] - minprice;
          }
      }
      return XXX;
    };

