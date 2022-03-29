 class Solution {
    
    private int n;
    private List<String> res;
    
    public List<String> XXX(int _n) {
        this.n = _n;
        res = new ArrayList<>();
        dfs(0, 0, "");
        return res;
    }
    
    private void dfs(int left, int right, String path) {
        if (left == n && right == n) {
            res.add(path);
            return;
        }
        
        if (left < n) {
            dfs(left + 1, right, path + "(");
        }
        
        if (right < left) {
            dfs(left, right + 1, path + ")");
        }
    }
}