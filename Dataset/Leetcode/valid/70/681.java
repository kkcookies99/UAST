class Solution {
    public int XXX(int n) {
        if(n<=2)return n;
        int dp_1=1;
        int dp_2=2;
        n=n-2;
        int dp=0;
        while(n-->0){
            dp=dp_1+dp_2;
            dp_1=dp_2;
            dp_2=dp;
        }
        return dp;
    }
}

