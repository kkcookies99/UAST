class Solution {
    public int XXX(int[] nums) {
        int maxSum = nums[0];
        int curentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curentSum = Math.max(nums[i], curentSum + nums[i]);
            maxSum = Math.max(maxSum, curentSum);   //每次都找出当前的最优解
        }
        return maxSum;
    }
}

