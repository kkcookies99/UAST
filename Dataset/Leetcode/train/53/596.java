 class Solution {
    public int XXX(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxSum = nums[0];
        for (int len = 1; len <= nums.length; len++) {
            int i = 0;
            int j = 0;
            int sum = 0;
            while (j < nums.length) {
                while (j - i + 1 <= len) {
                    sum += nums[j];
                    j++;
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
                sum -= nums[i];
                i++;
            }
        }
        return maxSum;

    }
}

