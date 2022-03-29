 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new LinkedList<>();
        helper(res, n, n, new StringBuilder());
        return res;
    }

    private void helper(List<String> res, int l, int r, StringBuilder sb) {
        if (l == 0 && r == 0) {
            res.add(sb.toString());
            return;
        }
        if (l == r) {
            sb.append("(");
            helper(res, l - 1, r, sb);
            sb.deleteCharAt(sb.length() - 1);
        } else if (l < r) {
            if (l > 0) {
                sb.append("(");
                helper(res, l - 1, r, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(")");
            helper(res, l, r - 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


