 class Solution {
    public List<String> XXX(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, new String(), 0, 0, n);
        return ans;
    }
    public void backtrack(List<String> ans, String cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(new String(cur));
            return;
        }
        if (open < max) backtrack(ans, cur + "(", open + 1, close, max);
        if (close < open) backtrack(ans, cur + ")", open, close + 1, max);
    }
}

