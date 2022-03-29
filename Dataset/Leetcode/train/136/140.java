 class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        int len = nums.length;
        for(int i=0; i<len; i++){
            result = result^nums[i];
        }
        return result;
    }
}

