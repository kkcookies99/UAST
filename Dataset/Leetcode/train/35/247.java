 class Solution {
    public int XXX(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            int m = (i+j)/2;
            if(nums[m]<target){
                i = m+1;
            }else if(nums[m]>target){
                j = m-1;
            }else{
                return m;
            }
        }
        return i;
    }
}

