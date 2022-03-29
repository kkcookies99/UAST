 class Solution {
   public String XXX(String s) {
        if(s == null || s.length() < 2){
            return s;
        }
        int l = 0;
        int max = 0;
        boolean[][] dp = new boolean[s.length() ][s.length() ];
        dp[0][0] = true;
        dp[1][0] = true;
        dp[0][1] = true;
        for(int i = 1; i < dp.length  ; i++){
            dp[i][i] = true;
            for(int j = 0; j <= i; j++){
                   if(i - j < 2){
                       dp[j][i] = s.charAt(j) == s.charAt(i);
                   }
                   else
                   dp[j][i] = dp[j+1][i-1] && (s.charAt(j) == s.charAt(i));

                   if(dp[j][i] && i - j + 1 > max){
                         max = i - j + 1;
                         l = j;
                   }
            }
        }
        return  s.substring(l, l + max );
    }
}

