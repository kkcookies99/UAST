 class Solution {

    public List<String> XXX(int n) {
        List<String> ans = new LinkedList<>();
        dfs(ans, 0, 0, n, "");
        return ans;
    }

    private void dfs(List<String> ans, int leftCount, int rightCount, int n, String tmp) {
        if (leftCount + rightCount == 2 * n) {
            ans.add(tmp);
            return;
        }
        if (leftCount < n) {
            dfs(ans, leftCount + 1, rightCount, n, tmp + '(');
        }
        if (rightCount < leftCount) {
            dfs(ans, leftCount, rightCount + 1, n, tmp + ')');
        }
    }
    
}

