 class Solution {
    public int XXX(int m, int n) {
        if(m<0 || n<0) return 0;
        int[] dp=new int[n];

        //初始化
        //第一行
        for(int j=0;j<n;j++) dp[j]=1;

        //计算
        for(int i=1;i<m;i++){
            //每一行的第一个元素都为1保持不变，即dp[i][0]=1;
            for(int j=1;j<n;j++) dp[j]=dp[j]+dp[j-1];
        }

        return dp[n-1];
    }
}

