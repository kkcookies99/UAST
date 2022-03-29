 class Solution {
    public int XXX(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxResult = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            maxResult = Math.max(maxResult, dp[i]);
        }
        return maxResult;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


