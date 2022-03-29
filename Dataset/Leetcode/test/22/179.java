 class Solution {
    public List<String> XXX(int n) {
        List<String> ret = new ArrayList<>();
        _generator("", ret, n, 0, 0);
        return ret;
    }

    private static void _generator(String sub, List<String> ret, int n, int l, int r) {
        if (l == n && r == n) {
            ret.add(sub);
            return;
        }
        if (l < n) _generator(sub + "(", ret, n, l + 1, r);
        if (l > r) _generator(sub + ")", ret, n, l, r + 1);
    }
}

