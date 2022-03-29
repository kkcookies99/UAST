 class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length==1&&nums[0]==0){
            return true;
        }
        int end=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=end){
                end=i;
            }
        }
        return end==0;    
    }
}

