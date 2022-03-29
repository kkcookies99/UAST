class Solution {
    public int XXX(int[] nums) {
        int maxSubSum = Integer.MIN_VALUE, cur = 0;
        for(int i = 0; i < nums.length; i++){
            cur += nums[i];
            maxSubSum = cur > maxSubSum ? cur : maxSubSum;
            cur = cur < 0 ? 0 : cur;
        }
        return maxSubSum;
    }
}

