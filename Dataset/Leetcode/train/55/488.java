 class Solution {
    public boolean XXX(int[] nums) {
        int min = 1;
        boolean res = true;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<min){
                min++;
                res = false;
            }else{
                res = true;
                min = 1;
            }
        }
        return res;
    }
}

