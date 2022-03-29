 class Solution {
    public String XXX(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int max = 0;
        String result = "";
        for(int i=0; i<n; i++){
            for(int j=i; j>=0; j--){
                if(i==j){
                    // 一个数
                    dp[i][j] = true;
                    if(s.substring(j, i+1).length() > max){
                        max = s.substring(j, i+1).length();
                        result = s.substring(j, i+1);
                    }
                }else if(j == i-1){
                    // 两个数
                    if(s.charAt(i) == s.charAt(j)){
                        dp[j][i] = true;
                        if(s.substring(j, i+1).length() > max){
                            max = s.substring(j, i+1).length();
                            result = s.substring(j, i+1);
                        }
                    }else{
                        dp[j][i] = false;
                    }
                }else{
                    // 三个及以上
                    if((s.charAt(j) == s.charAt(i))&&dp[j+1][i-1] == true){
                        dp[j][i] = true;
                        if(s.substring(j, i+1).length() > max){
                            max = s.substring(j, i+1).length();
                            result = s.substring(j, i+1);
                        }
                    }else{
                        dp[j][i] = false;
                    }
                }
            }
        }
        return result;
    }
}

