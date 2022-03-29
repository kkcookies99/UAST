class Solution {
    public int XXX(int[] nums) {
        int n = nums.length;
        int[] f = new int[n];
        Arrays.fill(f, Integer.MIN_VALUE);

        f[0] = nums[0];
        int res = f[0];

        for(int i = 1; i < n; ++i) {
            f[i] = nums[i];
            f[i] = Math.max(f[i], f[i - 1] + nums[i]);
            res = Math.max(res, f[i]);
        }

        return res;
    }
}

