class Solution {
    public boolean XXX(int[] nums) {
        if(nums == null || nums.length < 2) return true;
        int max = 0;
        for(int i = 0; i <= max; i++){
            max = Math.max(max, i + nums[i]);
            if(max >= nums.length-1) return true;
        }
        return false;
    }
}

