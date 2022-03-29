class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 1) return true;
        int maxIndex = nums[0];
        for(int i = 1; i <= maxIndex; i++){
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if(maxIndex >= nums.length - 1) return true;
        }
        return false;
    }
}

