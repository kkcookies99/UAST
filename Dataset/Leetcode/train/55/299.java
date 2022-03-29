class Solution {
    public boolean XXX(int[] nums) {
        // 遍历所有情况
        // 0 <= i < nums.length ;  1 <= j <= nums[i];
        // i 表示在哪一个位置 ； j 表示我要跳几步，遍历所有情况
        // 声明一个dp[] 数组 , dp[i] 表示的是从 i 这里开始跳 
        // 是否能够跳到  target = nums.length - 1 ， 最后一个下标
        // 所以 dp[i] = （i + j >= target) || dp[i + j];
        //  i + j >= target 表示从 i 开始跳 j 步 可以跳到大于等于 target ;
        //  dp[i + j] 表示的是我 跳到 i + j 的地方, dp[i + j] 这个地方可不可以跳到 target
        int n = nums.length;
        if(n < 2){
            return true;
        }
        int target = n - 1;
    
        boolean[] dp = new boolean[n];
        for(int i = n - 2 ; i >= 0 ; i--){
            for(int j = nums[i]; j > 0; j--){
                dp[i] = (i + j >= target) || dp[i + j];
                if(dp[i]) break;
            }
        }
        
        // 因为初始要从 0 开始 ， 所以判断从 0 开始是否可以跳到 ，返回 dp[0]
        return dp[0];
    }
}

