 class Solution {
    public boolean XXX(int[] nums) {
        int min = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] >= min - i){
               min = i; 
            }
        }
        if (min != 0){
            return false;
        }
        return true;
    }
}

