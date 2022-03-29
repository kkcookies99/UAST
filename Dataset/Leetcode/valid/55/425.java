 class Solution {
    public boolean XXX(int[] nums) {
        int farest = 0;
        for(int i = 0;i <= farest;i++) {
            if(farest >= nums.length - 1) return true;
            if(nums[i] + i > farest) {
                farest = nums[i] + i;
            }
        }
        return false;
    }
}

