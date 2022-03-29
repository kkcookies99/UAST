 public int XXX(int[] nums) {
    if(nums.length==1) return nums[0];
    int n = nums.length;
    int dp[] = new int[n];
    dp[0] = nums[0];
    int max = Integer.MIN_VALUE;
    for(int i=1;i<n;i++){

        dp[i] = Math.max(nums[i],(dp[i-1] + nums[i]));

        max = Math.max(Math.max(dp[i-1],dp[i]),max);
    }

    return max;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


