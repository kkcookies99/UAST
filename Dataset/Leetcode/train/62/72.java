 class Solution {
    public int XXX(int m, int n) {
        int[][] f=new int[m+1][n+1];
         for(int i=m;i>0;i--){
             f[i][1]=1;
         }
         for(int i=n;i>0;i--){
             f[1][i]=1;
         }
         for(int i=2;i<=m;i++){
             for(int j=2;j<=n;j++){
                 f[i][j]=f[i][j-1]+f[i-1][j];
             }
         }
         return f[m][n];
    }
}

