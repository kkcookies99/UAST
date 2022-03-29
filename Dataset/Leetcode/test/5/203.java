 class Solution {
    public String XXX(String s) {
        
        int max = 0;
        int index = 0;
        int l = s.length();
        if(l == 0)return "";
        if(l == 1)return s;
        int[][] dp = new int[l][l];
        for(int i = 0;i < l;i++){
            dp[i][i] = 1;
        }

        for(int j = l - 2;j >= 0;j--){
            char a = s.charAt(j);
            for(int k = j + 1;k < l;k++){
                char b = s.charAt(k);
                if(a != b)dp[j][k] = Math.max(dp[j][k - 1],dp[j + 1][k]);
                if(a == b){
                    //确保内部为回文串
                    if(dp[j + 1][k - 1] == k - j - 1){
                        dp[j][k] = dp[j + 1][k - 1] + 2;
                    }
                    if(dp[j + 1][k - 1] < k - j - 1){
                        dp[j][k] = Math.max(dp[j][k - 1],dp[j + 1][k]);
                    }
                }
                if(dp[j][k] > max){
                    max = dp[j][k];
                    index = k;
                }
            }
        }
        return s.substring(index - max + 1,index + 1);
    }
}

