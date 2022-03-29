public int XXX(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max=nums[0];
        int[][] dp=new int[nums.length][2];
        dp[0][0]=nums[0];
        dp[0][1]=nums[0];
        for(int i=1;i<nums.length;i++){
            //dp[i][0]表示当第i个数据没有被选取时得到的最大子序和:
            dp[i][1]=Math.max(dp[i-1][1]+nums[i],nums[i]);
           //dp[i][1]表示当第i个数据被选取时得到的子序和:
            dp[i][0]=Math.max(dp[i-1][1],dp[i-1][0]);
        }
        return Math.max(dp[nums.length-1][0],dp[nums.length-1][1]);
    }

