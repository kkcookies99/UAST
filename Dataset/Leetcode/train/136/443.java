 class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int length =nums.length;
        for(int i = 0; i < length ; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}

