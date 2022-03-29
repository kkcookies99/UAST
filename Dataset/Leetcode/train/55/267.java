class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 1) return true;
        int m = nums.length;
        // dp数组表示经过该节点最远可以跳到哪
        int[] dp = new int[m];
        Arrays.fill(dp, -1);
        // 不能包括最后一个数
        for(int i = 0;i<m-1;i++){
            dp[i] = func(i, dp, nums);
        }
        return (Arrays.stream(dp).max().getAsInt() >= m-1);

    }

    public int func(int n, int[] dp, int[] nums){
        if(n == 0) return nums[0];
        if(dp[n]!=-1) return dp[n];
        if(func(n-1, dp, nums)>=n) {
        	return Math.max(func(n-1, dp, nums), n + nums[n]);
        } else {
        	return func(n-1, dp, nums);
        }

    }
}

