  public int XXX(int[] nums) {
        int n = nums.length;
        if(n == 1)return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        int maxRes = dp[0];
        for(int i = 1; i < n; i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            maxRes = Math.max(dp[i],maxRes);
            System.out.println(maxRes);
        }
    return maxRes;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


