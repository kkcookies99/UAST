 class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        for(int i = 1;i < nums.length;i++){
            nums[i] = nums[i-1] ^ nums[i];
        }
        return nums[nums.length - 1];
    }
}

