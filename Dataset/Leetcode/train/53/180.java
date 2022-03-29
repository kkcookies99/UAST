class Solution {
    public int XXX(int[] nums) {
        //定义dp数组：
        //dp[i]是以nums[i]为结尾的和最大的子数组所对应的和
        int[] dp = new int[nums.length];
        //base case
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }

        //遍历一遍dp数组，找最大
        int res = dp[0];
        for (int i = 1; i < dp.length; i++) {
            res = res > dp[i] ? res : dp[i];
        }

        return res;
    }
}

空间压缩：
class Solution {
    public int XXX(int[] nums) {
        //定义dp数组：
        //dp[i]是以nums[i]为结尾的和最大的子数组所对应的和
        //int[] dp = new int[nums.length];
        //base case
        //dp[0] = nums[0];
        int max = nums[0];
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int cur = Math.max(nums[i], pre + nums[i]);
            pre = cur;
            max = max > cur ? max : cur;
        }

        return max;
    }
}

