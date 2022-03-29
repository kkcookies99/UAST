 class Solution {
    public int XXX(int m, int n) {
        if(m==1&&n==1){
            return 1;
        }
        int[][] g = new int[m][n];
        g[0][0]=0;
        for(int i = 1;i<m;i++){
            g[i][0]=1;
        }
        for(int i = 1;i<n;i++){
            g[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                g[i][j]=g[i-1][j]+g[i][j-1];
            }
        }
        return g[m-1][n-1];
    }
}

