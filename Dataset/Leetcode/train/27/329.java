 class Solution {
    public int XXX(int[] nums, int val) {
        int i=0,j=0;
        for(;i<nums.length;i++) {
            if(nums[i]!=val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}

