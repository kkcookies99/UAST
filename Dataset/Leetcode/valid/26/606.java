 class Solution {
    public int XXX(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]!=nums[j+1]){
                nums[++i]=nums[j+1];
            }
        }
        return i+1;
    }
}

