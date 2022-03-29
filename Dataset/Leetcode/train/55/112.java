class Solution {
    public boolean XXX(int[] nums) {
        int far = 0;
        int n = nums.length-1;
        for(int i = 0; i <= far; i++){
            if(nums[i]+i>far){
                far = nums[i]+i;
            }
            if(far>=n){
                return true;
            }
        }
        return false;
    }
}

