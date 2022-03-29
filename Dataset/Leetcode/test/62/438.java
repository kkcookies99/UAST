class Solution {
    public int XXX(int m, int n) {
        int[] dp = new int[m];
        Arrays.fill(dp, 1);
        for (int j = 0; j < n - 1; j++) {
            for (int i = 1; i < m; i++) {
                dp[i] = dp[i] + dp[i - 1];
            }
        }
        return dp[m - 1];
    }
}```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


