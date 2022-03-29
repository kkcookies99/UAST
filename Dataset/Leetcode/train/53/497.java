 class Solution {
    public int XXX(int[] nums) {
        int max = nums[0];
        int lastSum = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i + 1];
            lastSum = Math.max(lastSum, 0);
            lastSum += num;
            if (lastSum > max) {
                max = lastSum;
            }
        }
        return max;
    }
}

