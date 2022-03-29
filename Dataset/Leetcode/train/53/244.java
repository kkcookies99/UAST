class Solution {
    public int XXX(int[] nums) {
        int max = nums[0];
        int res = 0;
        int length = nums.length;
        for (int i = 0;i < length;i++) {
            res += nums[i];
            if (nums[i] > res) {
                res = nums[i];
            }
            max = Math.max(max,res);
        }
        return max;
    }
}

