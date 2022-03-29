    public int XXX(int[] nums) {
        //设dp[i]是以数组第i个元素为结尾[0-i]的最大值
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        //记录最大和
        int max=dp[0];
        for(int i=1; i<nums.length; i++){
            //如果dp[i-1]>0那么加上这个数是肯定比原来大的
            dp[i]=dp[i-1]>0? nums[i]+dp[i-1]:nums[i];
            max=dp[i]>max? dp[i]:max;
        }
        return max;
    }

