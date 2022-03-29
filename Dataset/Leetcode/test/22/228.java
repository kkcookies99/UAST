 class Solution {
    List<String> res = new ArrayList<>();
    public List<String> XXX(int n) {
        // 参数为左右括号剩余可用数量 和 当前路径
        recur(n, n, new StringBuilder());
        return res;
    }

    private void recur(int left, int right, StringBuilder sb){
        // 左右都恰好用完 则添加到最终结果
        if (left == 0 && right == 0){
            res.add(sb.toString());
            return;
        }

        // 如果左括号剩余数量大于右括号 则后面一定会出现不匹配情况 因此直接在这提前返回
        if (left > right){
            return;
        }
        
        // 如果左右括号任一不足 直接返回
        if (left < 0 || right < 0){
            return;
        }

        // 递归 + 回溯
        sb.append("(");
        recur(left - 1, right, sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(")");
        recur(left, right - 1, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}

