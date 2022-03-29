class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int n = nums.length-1;
        for(int i=n-1; i>=0; i--){
            if(nums[i] >= n-i){
                n = i;
            }
            if(n == 0){
                return true;
            }
        }
        return false;
    }
}

