 class Solution {
    private List<String> res = new ArrayList<>();
    public List<String> XXX(int n) {
        generate("", n, 0, 0);
        return res;
    }

    private void generate(String s, int n, int left, int right) {
        if (s.length() == n*2) {
            res.add(s);
        }
        if (left < n) {
            // 还可以加左括号
            generate(s + "(", n, left+1, right);
        }
        if (left > right) {
            // 还可以加右括号
            generate(s+")", n, left, right+1);
        }
    }
}

