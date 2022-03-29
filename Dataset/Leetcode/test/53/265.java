    public int XXX(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length ; i ++){
            //状态转义方程，表示第 i 位数字位末尾的序列的最大和
            dp[i] = Math.max(dp[i - 1]+ nums[i],nums[i]);
        }
        int max = dp[0];
        for(int x : dp){
            //找出最大的那个
            if(x > max){
                max = x;
            }
        }
        return max;
    }

