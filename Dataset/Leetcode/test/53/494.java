 class Solution {
    public int XXX(int[] nums) {
        // 创建 dp 数组, dp[i] 表示"连续到"第 i 个时的子串和
        // 如示例 1, dp[1] = 1, dp[2] = -2, dp[3] = 4, dp[4] = 3
        int[] dp = new int[nums.length];
        // 初始化 dp 数组
        dp[0] = nums[0];
        int max = nums[0];
        // 遍历
        for(int i = 1; i < nums.length; i++) {
            // 如果 dp[i - 1] >= 0, nums[i] >= 0, 
              //  dp[i] = dp[i - 1] + nums[i], 如果加之后的值大于 max, 更新 max
            // 如果 dp[i - 1] >= 0. nums[i] < 0,  dp[i] = dp[i - 1] + nums[i]
            // 如果 dp[i - 1] < 0, nums[i] >= 0, dp[i] = nums[i], 如果值大于 max, 更新 max
            // 如果 dp[i - 1] < 0, nums[i] < 0, dp[i] = nums[i]
            if(dp[i - 1] >= 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


