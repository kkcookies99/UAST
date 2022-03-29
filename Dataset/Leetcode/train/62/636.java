class Solution {
    public int XXX(int m, int n) {
        int[] dp = new int[n];
        // for(int i = 0; i < m; i++) dp[i][0] = 1;
        for(int i = 0; i < n; i++) dp[i] = 1;

        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                if(j == 0) dp[j] = 1;
                else dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


