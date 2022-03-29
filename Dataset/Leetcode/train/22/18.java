 class Solution {
    private final List<String> res = new ArrayList<>();
    public List<String> XXX(int n) {
        dfs(n, n, "");
        return res;
    }

    private void dfs(int leftRemain, int rightRemain, String temp) {
        if (leftRemain == 0 && rightRemain == 0) {
            res.add(temp);
            return;
        }
        if (leftRemain > rightRemain) {
            return;
        }
        if (leftRemain > 0) dfs(leftRemain - 1, rightRemain, temp + String.valueOf("("));
        dfs(leftRemain, rightRemain - 1, temp + String.valueOf(")"));
    }
}

