class Solution {
    public int XXX(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int[] nums = new int[n + 1];
        nums[1] = 1;
        nums[2] = 2;
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
}

