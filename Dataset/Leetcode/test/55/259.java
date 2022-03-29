class Solution {
    public boolean XXX(int[] nums) {
        int max = 1;
        for (int i = 0; i < max && i < nums.length; i++) {
            max = Math.max(nums[i] + i + 1, max);
        }
        return max >= nums.length;
    }
}

