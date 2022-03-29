class Solution {
    public int XXX(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            sum = sum > 0 ? sum + num : num;
            res = Math.max(res, sum);
        }
        return res;
    }
}

