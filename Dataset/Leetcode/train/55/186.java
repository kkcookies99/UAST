class Solution {
    public boolean XXX(int[] nums) {
        if(nums == null) return false;
        int step = nums[0];
        if(nums.length == 1) return true;
        if(step == 0) return false;
        for(int i = 0; i <= step; i++) {
            if(step >= nums.length - 1) return true;
            step = Math.max(nums[i] + i, step);
        }
        return false;
    }
}

