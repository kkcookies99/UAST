 class Solution {
    public int XXX(int[] nums) {
        int p = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[p++]=nums[i];
            }
        }
        return p;
    }
}

