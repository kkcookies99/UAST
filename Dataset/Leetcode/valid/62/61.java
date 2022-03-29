 class Solution {
    public int XXX(int m, int n) {
        ms = new int[m][n];
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                ms[i][j] = -1;
            }
        }
        
        return dfs(m,n,0,0);
    }
    
    int ms[][];
    
    private int dfs(int m,int n,int x,int y) {
        if (ms[x][y] != -1) {
            return ms[x][y];
        }
        
        if (x == m - 1 && y == n - 1) {
            return 1;
        }

        if (x == m - 1 && y < n - 1) {
            return 1;
        }
        
        if (y == n - 1 && x < m - 1) {
            return 1;
        }
        
        if (x + 1 < m && y + 1 < n) {
            return ms[x][y] = dfs(m,n,x + 1,y) + dfs(m,n,x,y + 1);
        }
        
        return 0;
    }
}

