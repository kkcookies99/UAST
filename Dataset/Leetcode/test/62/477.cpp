class Solution {
public:
    int f[110][110];
    
    int XXX(int m, int n) {
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(i == 0 && j == 0) f[i][j] = 1;
                else if(i == 0 && j !=0) f[i][j] = f[i][j-1] ;
                else if(i!=0 && j ==0) f[i][j] = f[i-1][j];
                else f[i][j] = f[i-1][j] + f[i][j-1];
        return f[m-1][n-1];
    }
};

