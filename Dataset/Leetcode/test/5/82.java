 class Solution {
    public String XXX(String s) {
        int n = s.length();
        String res = "";
        boolean[][] dp = new boolean[n][n];
        for(int i = 0 ;i < n; i++){
            for(int j = i; j >= 0 ;j --){
                if(s.charAt(i) == s.charAt(j) && ( i - j < 2 || dp[i-1][j+1]))
                    dp[i][j] = true;
                if (dp[i][j] && (i - j + 1 > res.length())){
                    res = s.substring(j,i+1);
                }
            }
        }
        return res;
        
    }
}

