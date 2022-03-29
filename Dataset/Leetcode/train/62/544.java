class Solution {
    public int XXX(int m, int n) {
        int[][] a = new int[m+1][n+1];
        //第一行第一列只有一条路劲
        for(int i=1;i<=n;i++){
            a[1][i] = 1;
        }
        for(int i=1;i<=m;i++){
            a[i][1] = 1;
        }
        //策略a[x][y] = a[x-1][y]+a[x][y-1]
        //正向递推、同时维护a数组
        for(int i=2;i<=m;i++){
            for(int j=2;j<=n;j++){
                a[i][j] = a[i-1][j]+a[i][j-1];
            }
        }
        return a[m][n];
    }
}

