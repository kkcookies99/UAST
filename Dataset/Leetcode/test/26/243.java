 class Solution {
    public int XXX(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[pointer] != nums[i]){
                pointer++;
                nums[pointer] = nums[i];
            }
        }
        return pointer+1;
    }
}

