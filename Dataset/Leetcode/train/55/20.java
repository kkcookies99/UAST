class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 1)
            return true;
        return dp(nums, nums.length - 1);
    }
    public boolean dp(int[] nums, int n){
        if(n == 0 && nums[0] > 0)
            return true;
        boolean result = false;
        int count = 1;
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] - count >= 0){
                result =  (dp(nums, i)) ? true : result;
            }
            count++;
        }
        return result;
    }
}

