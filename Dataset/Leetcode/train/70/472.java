class Solution {
    public int XXX(int n) {
        /*
            dp:
            1.dp[i]:爬到i+1层有几种方法
            2.元素之间的关系:
                dp[i]=dp[i-1]+dp[i-2];
            3.初始条件
                dp[0]=1;  //第0+1层有1种方法
                dp[1]=2;  //第1+1层有2种方法
            进阶:
                观察2.元素之间的关系:dp[i]=dp[i-1]+dp[i-2];
                容易发现要计算dp[i]只需要直到dp[i-1]与dp[i-2];
                为此可以只用两个量来记录dp[i-1]与dp[i-2];来减少空间复制度
        */
        if(n==1) return 1;
        if(n==2) return 2;
        int p,q,res;
        p=1;
        q=2;
        res=0;
        for(int i=3;i<=n;i++){
            res=p+q;
            p=q;
            q=res;
        }
        return res;
    }
}

