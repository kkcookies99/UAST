 class Solution {
    public int XXX(int[] nums, int val) {
        int saveIndex = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] != val) {
                nums[saveIndex++] = nums[i];
            }
        }
        return saveIndex;
    }
}

