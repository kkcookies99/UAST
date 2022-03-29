 public boolean XXX(int[] nums) {
        //dp[i] 在i点记录，i点之前的步数是否可以走到i点，true或false
        if (nums == null || nums.length == 0) {
            return false;
        }
        int len = nums.length;
        boolean[] dp = new boolean[len];
        dp[0] = true;//初始化
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                //从j到i，需要两个条件：j点可以到达（dp[j]=true）,nums[j]的值要>=j到i的距离
                if (dp[j] && (nums[j] >= i - j)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len - 1];
    }

