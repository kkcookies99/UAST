 class Solution {
    public boolean XXX(int[] nums) {
        int n = nums.length;
        int end = n-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] + i >= end){
                end = i;
            }
        }
        return end == 0;
    }
    
}

