public int XXX(int[] nums) {
        int max=nums[0];        
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
//dp[i]表示选择第i个数据时，得到的子序和。但是最大值并非一定是最后一个(nums.length-1)，所以需要 动态记录最大值
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

