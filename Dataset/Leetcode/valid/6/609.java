 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1||s.length()/numRows==0){
            return s;
        }
        int num = 2*s.length()/(2*numRows-2)+1;
        String dp[][] = new String[numRows][num];
        String res = "";
        int k = 0;
        for(int i=0,j=0;i<s.length();j+=2){
            while(k<numRows&&i<s.length()){
                dp[k++][j]=String.valueOf(s.charAt(i++));
            }
            k-=2;
            while(k>0&&i<s.length()){
                dp[k--][j+1]=String.valueOf(s.charAt(i++));
            }
        }
        for(int m=0;m<numRows;m++){
            for(int n=0;n<num;n++){
                if(dp[m][n]!=null){
                res=res+dp[m][n];
                }
            }
        }
        return res;
    }
}

