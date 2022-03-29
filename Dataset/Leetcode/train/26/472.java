 class Solution {
    public int XXX(int[] nums) {
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[index-1]!=nums[i]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}

