 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0)
            return res;
        dfs(n, 0, 0, res, "");
        return res;
    }

    private void dfs(int n, int left, int right, List<String> res, String cur){
        if (cur.length() == n*2) {
            res.add(cur);
            return ;
        }

        if (left >= 0 && left < n) 
            dfs(n, left+1, right, res, cur+"(");
        if (right < left)
            dfs(n, left, right+1, res, cur+")");
    }
}

