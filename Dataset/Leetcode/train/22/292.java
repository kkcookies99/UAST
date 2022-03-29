 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(res, n, n, sb);
        return res;
    }

    public void backtrack(List<String> res, int left, int right, StringBuilder sb) {
        // 使用规范括号的规律，其中左括号的数量一定是 >= 右括号，所以可以进行计数base case
        // 左括号大于右括号剩余数量，违背规律，不满足条件
        if (left > right) {
            return;
        }

        //左括号使用超了，也不满足条件
        if (left < 0) {
            return;
        }

        // 左右括号都使用完了，因为n对括号，left==0，right==0，一定满足条件
        if (left == 0 && right == 0) {
            res.add(sb.toString());
            return;
        }

        sb.append('(');
        backtrack(res, left - 1, right, sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(')');
        backtrack(res, left, right - 1, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}

