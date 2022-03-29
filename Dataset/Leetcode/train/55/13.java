class Solution {
    public boolean XXX(int[] nums) {
        boolean res = true;
        int n = 1;
        for(int i = nums.length-1;i>0;i--){
            if(nums[i-1]>=n){
                res = true;
                n=1;
            }else{
                n++;
                res = false;
            }
        }
        return res;
    }
}

