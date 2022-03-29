 class Solution {
    public List<String> XXX(int n) {
        int left = n;
        int right = n;
        List<String> res = new ArrayList<>();
        helper("", left, right, res);
        return res;
    }

    private void helper(String s, int left, int right, List<String> res) {
        if (left == 0 && right == 0){
            res.add(s);
        }
        if (left < 0 || right < 0){
            return;
        }

        if (left > right){
            return;
        }
        helper(s+"(", left-1, right, res);
        helper(s+")", left, right-1, res);
    }
}

