class Solution {
    public int XXX(int m, int n) {
        if(m < n){//极致的缩小空间，可以m和n哪个小用哪个，我可真是个小机灵鬼
            int temp = m;
            m = n;
            n = temp;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 0;i < m;++i){
            for(int j = 1;j < n;++j){
                dp[j] = dp[j - 1] + dp[j];//用上一行的值计算出当前行的值，就可以直接替换了，这列的上一行的值用不上了，这时候dp[j-1]是当前行的左值
            }
        }
        return dp[n - 1] ;
    }
}

