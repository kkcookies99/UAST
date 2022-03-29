 class Solution {
    public List<String> XXX(int n) {
        List<String> ret = new ArrayList<>();
        backtrack(n, "", 0, 0, ret);
        return ret;
    }

    private void backtrack(int n, String tmp, int left, int right, List<String> ret) {
        if(right == n) {
            ret.add(tmp);
            return;
        }
        if(left < n) {
            backtrack(n, tmp + "(", left + 1, right, ret);
        }
        if(left > right) {
            backtrack(n, tmp + ")", left, right + 1, ret);
        }
    }

}

