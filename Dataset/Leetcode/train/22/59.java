 class Solution {

    private List<String> res = new ArrayList<>();
    private int left, right;

    public List<String> XXX(int n) {
        left = right = n;
        char[] chs = new char[n * 2];
        chs[0] = '(';
        left--;
        chs[n * 2 - 1] = ')';
        dfs(chs, 1);
        return res;
    }

    public void dfs(char[] chs, int idx) {
        if (idx == chs.length - 1) {
            res.add(new String(chs));
            return;
        }
        if (left > 0) {
            chs[idx] = '(';
            left--;
            dfs(chs, idx + 1);
            left++;
        }
        if (left < right) {
            chs[idx] = ')';
            right--;
            dfs(chs, idx + 1);
            right++;
        }
    }
}

