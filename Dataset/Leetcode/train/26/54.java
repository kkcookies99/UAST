 class Solution {
    public int XXX(int[] nums) {
        int n = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=nums[n]){
                n+=1;
                nums[n]=nums[i];
            }
        }
        return n+1;
    }
}

