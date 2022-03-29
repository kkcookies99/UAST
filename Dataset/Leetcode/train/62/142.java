 class Solution {
    public int XXX(int m, int n) {
        //m=1,n=1这种情况好迷阿,为啥不是0.
        if(m==1&&n==1)
            return 1;
        int [][]dps=new int[n][m];
        dps[0][0]=0;
        for(int i=1;i<n;i++)
        {
            dps[i][0]=1;
        }
        for(int j=1;j<m;j++)
        {
            dps[0][j]=1;
        }    
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                dps[i][j]=dps[i-1][j]+dps[i][j-1];
            }
        }
        return dps[n-1][m-1];
    }
}

