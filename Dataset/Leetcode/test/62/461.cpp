class Solution {
public:
    int a[101][101]={0};
    int res(int m,int n)
    {
        if(m==1||n==1)
        return 1;
        if(a[m][n-1]==0&&a[m-1][n]==0)
        {
            a[m][n-1]=a[n-1][m]=res(m,n-1);
            a[m-1][n]=a[n][m-1]=res(m-1,n);
        }
        else if(a[m][n-1]!=0&&a[m-1][n]==0)
        {
            a[m-1][n]=a[n][m-1]=res(m-1,n);
        }
        else if(a[m][n-1]==0&&a[m-1][n]!=0)
        {
            a[m][n-1]=a[n-1][m]=res(m,n-1);
        }
        return a[m][n-1]+a[m-1][n];
    }
    int XXX(int m, int n) {
        return res(m,n);
    }
};

