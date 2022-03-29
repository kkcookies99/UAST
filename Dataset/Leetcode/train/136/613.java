 class Solution {
    public int singleNumber(int[] nums) {
        int length = nums.length;
        int res = 0;
        for(int i = 0; i < length; i++){
            res ^= nums[i];
        }
        return res;
    }
}

