var XXX = function(n) {
   if(n < 2) return 1;
   const dp = [1,1];
   for(let i = 2;i <= n;i++){
       dp[i] = dp[i - 1] + dp[i - 2]
   }
   return dp[n]
};
// 时间复杂度O(n) 临时变量数组空间复杂度O(n)

//空数组改为两个变量,将空间复杂度下降至O(1)
var XXX = function(n) {
   if(n < 2) return 1;
   let dp0 = 1;
   let dp1 = 1;
   for(let i = 2;i <= n;i++){
      const  temp = dp0;
      dp0 = dp1;
      dp1 = dp0 + temp;
   }
   return dp1
};

