 class Solution {
    public int XXX(int[] nums) {
        /*动态规划思路：
        1、取每个位置上的最大子序和，两种选择A和前面合并，B不和前面合并
        2、找出其中的最大值
        */
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxsum = nums[0];

        for(int i = 1; i< nums.length; i++){
            if(nums[i]+dp[i-1] >= nums[i]){
                dp[i] = nums[i]+dp[i-1];
            }
            else{
                dp[i] = nums[i];
            }
            if(maxsum < dp[i]){
                maxsum = dp[i];
            }
        }
        return maxsum;
    }
}

