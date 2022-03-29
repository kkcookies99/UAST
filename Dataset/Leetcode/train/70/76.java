class Solution {
    public int XXX(int n) {
        //dp[n]=dp[n-2]+dp[n-1]
        if(n==1)
            return 1;
        int first=1;
        int second=2;
        boolean isFirst=true;
        for(int i=3;i<=n;i++){
            if(isFirst){
                first=first+second;
            }else{
                second=first+second;
            }
            isFirst=!isFirst;
        }
        return Math.max(first,second);
    }
}

