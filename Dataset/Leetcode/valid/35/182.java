 class Solution {
    public int XXX(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i] && i == nums.length - 1) return i+1;
            if (target <= nums[i]) return i;
        }
        return 0;
    }
}

