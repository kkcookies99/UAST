 class Solution {
    public boolean XXX(int[] nums) {
        int step_accu=0;
        for(int i=nums.length-1;i>=0;i--,step_accu++){
            if(nums[i]>=step_accu){
                step_accu=0;
            }
        }
        if(step_accu<=1){
            return true;
        }else{
            return false;
        }
    }
}

