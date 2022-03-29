 class Solution {
    public int XXX(int[] nums) {
        int count = nums.length < 1? 0 : 1;
        for(int i = 0;i < nums.length;i++){
            if(nums[i]>nums[count-1]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}

