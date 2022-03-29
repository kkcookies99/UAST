 class Solution {
    public String XXX(String s) {
        if(s.equals("")) return "";
        int max = 0,p=0,q=0;
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int len = 0;len<n;len++){
            for(int i = 0;i+len<n;i++){
                int j = i+len;
                if(i==j) dp[i][j] = 1;
                else if(s.charAt(i)==s.charAt(j)){
                    if(dp[i+1][j-1]==j-i-1)
                        dp[i][j] = j-i+1;
                    else
                        dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
                }
                else
                    dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
                if(dp[i][j]>max){
                    max = dp[i][j];
                    p = i;
                    q = j;
                }
            }
        }
        return s.substring(p,q+1);
    }
}

