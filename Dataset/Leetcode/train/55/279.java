class Solution {
    public boolean XXX(int[] nums) {
        int index=nums.length-1;
        while(index>0){
            int init=index;
            for(int i=index-1;i>=0;i--){
                if(nums[i]+i>=index){
                    index=i;
                    break;
                }
            }
            if(index==init){
                return false;
            }
        }
        return true;
    }
}

