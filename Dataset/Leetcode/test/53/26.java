class Solution {
    public int XXX(int[] nums) {
        int sum = 0, max = 0,M = nums[0];
        
        for (int i = 0; i< nums.length; i++){
            sum += nums[i];
            if (M < nums[i] )
                M = nums[i];
            if (max < sum){
                max = sum; 
            }
            if (sum < 0){
                sum = 0;
            }
        }
        if (M < 0)
            max = M;        
        return max;
    }
}


