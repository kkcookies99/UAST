 class Solution {
    public int singleNumber(int[] nums) {
        int single = nums[0];

        for(int i = 1; i < nums.length; i++){
            single ^= nums[i];
        }
        return single;
    }
}

