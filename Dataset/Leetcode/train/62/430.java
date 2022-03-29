class Solution {
    public int XXX(int m, int n) {
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0&&j==0)
                a[i][j]=1;
                else if(i==0)
                a[i][j]=a[i][j-1];
                else if(j==0)
                a[i][j]=a[i-1][j];
                else
                a[i][j]=a[i-1][j]+a[i][j-1];
            }
        }
        return a[m-1][n-1];
    }
}

