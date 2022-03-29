class Solution {
    public int XXX(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                dp[i] = dp[i-1] + dp[i - 2];
            } else {
                dp[i] = dp[i-1];
            }
        }
        return dp[n];
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


