 class Solution {
    public String XXX(String s) {
        int n=s.length();
        boolean [][] dp=new boolean[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],true);
        }
        int maxLen=0;
        int start=0;
        int end=0;
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                dp[i][j]=dp[i+1][j-1]&&(s.charAt(i)==s.charAt(j));

                if(dp[i][j]&&j-i+1>maxLen){
                    maxLen=j-i+1;
                    end=j+1;
                    start=i;
                }
            }
        }
        if(start==0&&end==0){
            return s.substring(0,1);
        }
        return s.substring(start,end);
    }
}

