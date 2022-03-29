 class Solution {
    public String XXX(String s) {
        if(s.equals("")){
            return "";
        }
        int length = s.length();
        //dp[i][j] 表示 从第i 到 第j 的子串是否为回文子串
        boolean[][] dp = new boolean[length][length];
        //初始化 都为 true
        for(boolean[] a: dp){
            Arrays.fill(a,true);
        }
        int start = 0;
        int max_len = 1;
        //先遍历列，在遍历行，否则会出错
        for(int j =0; j<length; j++){
            for(int i=0; i<length; i++){
                if(i>=j){
                    continue;
                }
                if(i+1 == j && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = true;
                }else{
                    // abba
                    dp[i][j] = dp[i+1][j-1] && s.charAt(i) == s.charAt(j);
                }
                if(dp[i][j] && j-i+1 > max_len){
                    max_len = j-i+1;
                    start = i;
                }
            }
        }
        return new String(s.toCharArray(), start, max_len);
    }
}

