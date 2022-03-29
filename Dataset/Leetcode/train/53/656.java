 class Solution {
    public int XXX(int[] nums) {
        int sum = 0;
        int ret = nums[0];
        for(int i = 0, len = nums.length; i < len; i++) {
            sum+=nums[i];
            ret = ret > sum ? ret : sum;
            if (sum < 0) {
                sum = 0;
            }
        }
        return ret;
    }
}

