 class Solution {
    public int XXX(int m, int n) {
        int r=0, c=0, sum=0;
        boolean[][] vis = new boolean[m][n];
        return backTrace(m, n, r, c, sum, vis);
    }
    private int backTrace(int m, int n, int r, int c, int sum, boolean[][] vis) {
        if (r==m-1 && c==n-1) {
            return sum+1;
        }
        if (r<m && c<n) {
            vis[r][c] = true;
            sum = backTrace(m, n, r+1, c, sum, vis);
            vis[r][c] = false;
            sum = backTrace(m, n, r, c+1, sum, vis);
            vis[r][c] = false;
        }
        return sum;
    }
}

