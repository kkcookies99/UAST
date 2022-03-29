class Solution {
    public int XXX(int[] nums) {
        int N = nums.length;
        int[] dp = new int[N];
        dp[N-1] = nums[N-1];
        for (int i=N-2; i>=0; i--) {
            int v1 = nums[i];
            int v2 = nums[i] + dp[i+1];
            dp[i] = v1 > v2 ? v1 : v2;//N-1....0，i 位置要或者不要 i+1 位置的值
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        return max;
    }
}

