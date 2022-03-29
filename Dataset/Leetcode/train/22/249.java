 class Solution {
    public List<String> XXX(int n) {
        List<String> ans = new ArrayList<>();
        backTrack(n, ans, "", 0, 0);
        return ans;
    }

    private void backTrack(int n, List<String> ans, String s, int left, int right) {
        if (left == n && right == n) {
            ans.add(s);
        }
        if (left > n || right > n) {
            return;
        }
        if (left <= n) {
            backTrack(n, ans, s + "(", left + 1, right);
            if (right < left) {
                backTrack(n, ans, s + ")", left, right + 1);
            }
        }
    }
}


