 class Solution {
    public String XXX(String s) {
        //dp[i][j]表示字符串i-j的子串是否为回文串，dp[i][j]=dp[i+1][j-1] && s[i]==s[j]
        int len=s.length();
        boolean[][] dp=new boolean[len][len]; 

        //base case
        if(s.length()==0 || s.length()==1)  return s;
        for(int i=0;i<len;i++){
            dp[i][i]=true;
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i>j) dp[i][j]=true;
            }
        }

        String ret=s.substring(0,1);
        //System.out.println(ret);
        for(int i=2;i<=len;i++){
            for(int j=0;j<len;j++){
                //边界条件
                if(i+j>len) break;

                dp[j][j+i-1]=dp[j+1][j+i-2] && s.charAt(j)==s.charAt(j+i-1);
                if(dp[j][j+i-1]==true && i>ret.length()) ret=s.substring(j,j+i);
            }
        }
        return ret;
    }
}

