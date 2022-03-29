 class Solution {
    public int XXX(int m, int n) {
        return dfs(m,n,0,0);
    }
    
    private int dfs(int m,int n,int x,int y) {
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
            return dfs(m,n,x + 1,y) + dfs(m,n,x,y + 1);
        }
        
        return 0;
    }
}

