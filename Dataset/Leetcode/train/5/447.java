 class Solution {
    public String XXX(String s) {
        if (s.length()<=1)
            return s;
        String longest = s.charAt(0)+"";
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for(int j = length-1;j>=0;j--){
            //j在前,i在后
            for(int i = j;i<length;i++){
                dp[j][i] = s.charAt(i)==s.charAt(j)&&((i-j<3)||dp[j+1][i-1]);
                if(dp[j][i]&&i-j+1>longest.length()){
                    longest = s.substring(j,i+1);
                }
            }
        }
        return longest;
        
    }
}

