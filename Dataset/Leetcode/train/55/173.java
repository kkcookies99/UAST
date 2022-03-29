class Solution {
    public boolean XXX(int[] nums) {
        // 需要跨越的障碍数，如果是倒数第二个开始到最后一个，那么至少需要一个
        int n = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < n) {
                n++;
            }
            if (nums[i] >= n) {
                n = 1;
            }
        }
        return n == 1;
    }
}

