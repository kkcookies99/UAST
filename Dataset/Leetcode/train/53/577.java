 class Solution {
    public int XXX(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int min = 0, ans = Integer.MIN_VALUE;
        for (int i = 1; i <= n; ++i) {
            sum = sum + nums[i - 1];
            ans = Math.max(ans, sum - min);
            min = Math.min(min, sum);
        }
        return ans;
    }
}```

