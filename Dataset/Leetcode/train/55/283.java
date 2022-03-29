class Solution {
    public boolean XXX(int[] nums) {
        if (nums.length < 1) return true;
        int max = nums[0];
        for (int i = 0; i <= max; i++) {
            if (max >= nums.length -1) return true;
            max = Math.max(max, nums[i] + i);
        }
        return false;
    }
}

