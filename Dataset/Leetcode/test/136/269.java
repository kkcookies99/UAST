 class Solution {
    public int singleNumber(int[] nums) {
        //异或相同为0
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^=nums[i];
        }
        return result;
    }
}

