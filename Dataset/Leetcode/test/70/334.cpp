class Solution {
public:



    int XXX(int n) {
      //如果用完全背包来解  应该是一个排列的问题
      //那么应该先遍历容量再遍历物体 1---2
      //完全背包解法
      vector<int>dp(n+1);
      dp[0] = 1;
      dp[1] = 1;
      for(int i = 2; i<= n; i++)
      {
          for(int j = 1; j<= 2; j++)
          {
              dp[i] = dp[i] + dp[i-j];
          }
      }
      return dp[n];


    }
};

