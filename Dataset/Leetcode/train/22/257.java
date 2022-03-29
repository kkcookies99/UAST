 class Solution {
    
    private void dfs(List<String> res, String str, int left, int right, int n) {
        if (left > n || right > n || right > left) {
            return;
        }

        if (left == n && right == n) {
            res.add(str);
            return;
        }

        dfs(res, (str + '('), left + 1, right, n);
        dfs(res, (str + ')'), left, right + 1, n);
        return;
    }

    public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, "", 0, 0, n);
        return res;
    }
}

