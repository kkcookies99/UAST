 class Solution {
    boolean[][] dp;
    public String XXX(String s) {
        dp=new boolean[s.length()][s.length()];
        //构建dp数组
        isPalindrome(s);
        int maxLen=0;
        int start=0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i; j <s.length() ; j++) {
                if(dp[i][j]){
                    if(j-i+1>maxLen){
                        maxLen=j-i+1;
                        start=i;
                    }
                }
            }
        }
        return s.substring(start,start+maxLen);
    }
    public void isPalindrome(String s){
        //注意先遍历j
        //防止 如：dp[0][2] 依赖dp[1][1],而dp[1][1]还没有赋值
        for (int j = 0; j <s.length() ; j++) {
            for (int i = j; i >=0 ; i--) {
                if(i==j){
                    dp[i][j]=true;
                }else if(i+1==j){
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                }else {
                    dp[i][j]=dp[i+1][j-1]&&s.charAt(i)==s.charAt(j);
                }
            }
        }
    }
}

