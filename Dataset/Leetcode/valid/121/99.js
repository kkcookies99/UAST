 var XXX = function(prices) {
    let dp=[];
    let max=0;
    dp[0]=prices[1]-prices[0];
    max=dp[0]>0?dp[0]:0;
    for(let i=1;i+1<prices.length;i++){
        let tmp=prices[i+1]-prices[i]
        console.log(i-1,tmp);
        dp[i]=Math.max(dp[i-1]+tmp,tmp);
        if(dp[i]>max){
            max=dp[i];
        }
    }
    return max;
};

