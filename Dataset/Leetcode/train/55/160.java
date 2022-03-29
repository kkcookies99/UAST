class Solution {
    public boolean XXX(int[] nums) {
        int N=nums.length;
        int pre=1;
        for(int i=N-2;i>=0;i--){
            if(nums[i]>=pre)           
                pre=1;
            else
                pre++;
            if(i==0&&pre>1) return false;
        }
        return true;
    }

