 import java.util.Arrays;
class Solution {
    public int XXX(String s) {
        int l = 0;
        int [] dp = new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.substring(l,i).indexOf(s.charAt(i))!=-1)
                l = s.indexOf(s.charAt(i), l)+1;
            dp[i+1] = Math.max(dp[i], i-l+1);
        }
        return dp[s.length()];
    }
}

