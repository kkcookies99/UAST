 class Solution {
    private List<String> res = new ArrayList<>();

    public List<String> XXX(int n) {
        dfs("", n, 0, 0);
        return res;
    }

    public void dfs(String ans, int n, int lc, int rc) {
        // 剪枝 右边扣号数量大于左边
        if(rc > lc || lc > n) return;
        // 满足结果
        if(lc == n && lc == rc) res.add(ans);
        // 遍历+递归
        dfs(ans+'(', n, lc+1, rc);
        dfs(ans+')', n, lc, rc+1);
    }
}

