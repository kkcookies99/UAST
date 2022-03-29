 class Solution {
    public boolean XXX(int[] nums) {
        int n=nums.length;
        int maxPosition=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=0){
                maxPosition=Math.max(maxPosition,i+nums[i]);
            }
            if(maxPosition<=i){
                return false;
            }
        }
        return true;
    }
}

