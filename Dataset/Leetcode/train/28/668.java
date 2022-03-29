 class Solution {
    public int XXX(String haystack, String needle) {
        int lenh = haystack.length();
        int lenn = needle.length();
        if(lenn==0) return 0;
        if(lenh==0) return -1;
        int x=0,y=0;
        int[] dp = new int[lenn+1];
        KMP(dp,needle);
        while(x<lenh&&y<lenn){
            if(y==-1||haystack.charAt(x)==needle.charAt(y)){
                x++;
                y++;
            }else{
               y = dp[y];
            }
        }
        if(y>=lenn){
            return (x-lenn);
        }else{
            return -1;
        }

    }
    public void KMP(int[] dp, String str){
        int i = -1,j = 0;
        dp[0] = -1;
        int len = str.length();
        while(j<len){
            if(i==-1||str.charAt(i)==str.charAt(j)){
                i++;
                j++;
                dp[j] = i;
            }else{
                i = dp[i];
            }
        }
    }
}

