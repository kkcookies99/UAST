 class Solution {
    public List<String> XXX(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, 0, 0, n, "");
        return result;
    }

    private void dfs(List<String> result,
                     int l,
                     int r,
                     int n,
                     String cur) {
        if (r > l || l > n) {
            return;
        }
        if (r == l && l == n) {
            result.add(cur);
            return;
        }
        dfs(result, l + 1, r, n, cur + "(");
        dfs(result, l, r + 1, n, cur + ")");
    }
}

