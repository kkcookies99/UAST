 class Solution {
    public String XXX(String s) {
        int n = s.length();
        if(n == 0)
            return null;
        String max = "";
        char[] c = s.toCharArray();
        boolean[][] dp = new boolean[n][n];
        for(int i = n - 1; i >= 0; i--){
            for(int j = i; j < n; j++){
                if(i == j)
                    dp[i][j] = true;
                else if(i + 1 == j)
                    dp[i][j] = c[i] == c[j];
                else
                    dp[i][j] = c[i] == c[j] && dp[i + 1][j - 1];
                if(dp[i][j])
                    if(j - i + 1 > max.length())
                        max = s.substring(i, j + 1);
            }
        }
        return max;
    }
}

