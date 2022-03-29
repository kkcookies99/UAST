 class Solution {
    public boolean XXX(int[] nums) {
        int i=nums.length-1;
        while(i>0){
            int flag=i;
            for(int j=i-1;j>=0;j--){
                if(nums[j]>=i-j){
                    i=j;
                    break;
                }
            }
            if(flag==i){
                return false;
            }
        }
        return true;
    }
}

