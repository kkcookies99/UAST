 var XXX = function(prices) {
   let n=prices.length;
   let dp=[];
   for(let i=0;i<n;i++){
       dp[i]=[];
       if(i-1==-1){
           dp[i][0]=0;
           dp[i][1]=-prices[i];
           continue;
       }
        dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
        dp[i][1]=Math.max(dp[i-1][1],-prices[i]);  
   }
   return dp[n-1][0];
};

