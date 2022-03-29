 class Solution {
    public int XXX(int[] nums) {
        int sum_pre = nums[0], sum = nums[0], ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ret = Math.max(ret,sum = Math.max(sum_pre + nums[i], nums[i]));
            sum_pre = sum;
        }
        return ret;
    }
}

