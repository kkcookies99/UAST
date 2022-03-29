 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, 0, 0, new char[2*n]);
        return res;
    }
    public void dfs(List<String> res, int count, int n, char[] cur) {
        if (count < 0) {
            return;
        }
        if (n == cur.length) {
            if (count == 0) {
                res.add(new String(cur));
            }
            return;
        }
        cur[n] = '(';
        dfs(res, count + 1, n + 1, cur);
        cur[n] = ')';
        dfs(res, count - 1, n + 1, cur);
    }
}


