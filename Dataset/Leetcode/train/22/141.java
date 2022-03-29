 class Solution {
    public List<String> XXX(int n) {
        ArrayList<String> res = new ArrayList<String>();
        backtrack(res, "", n, n);
        return res;

    }

    public void backtrack(ArrayList<String> res, String s, int left_p, int right_p) {
        if (left_p == 0 && right_p == 0) {
            res.add(s);
            return;
        }
        if (left_p < 0 || right_p < 0 || left_p > right_p) return;
        backtrack(res,s+"(",left_p-1,right_p);
        backtrack(res,s+")",left_p,right_p-1);
    }
}

