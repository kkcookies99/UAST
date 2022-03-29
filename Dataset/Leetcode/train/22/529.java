 class Solution {
    public List<String> XXX(int n) {
        //特判
        if(n == 0){
            return new ArrayList<String>();
        }
        // 记录所有合法的括号组合
        List<String> result = new ArrayList<>();
        // 回溯过程中的路径，用StringBuffer来添加或者删除字符串中的字符
        StringBuffer track = new StringBuffer();
        // 可用的左括号和右括号数量初始化为 n
        backtrack(n, n, track, result);
        return result;
    }
    //可用的左括号数量为 left 个，可用的右括号数量为 right 个
    private void backtrack(int left, int right, StringBuffer track, List<String> result){
        //剪枝
        //如果左括号剩的多，那肯定不合法，直接返回
        if(left > right) return;
        //数量小于0那就离谱，肯定也是不合法
        if(left < 0 || right < 0) return;
        //结束条件，当所有括号恰好用完时，得到一个合法的括号组合
        if(left == 0 && right == 0){
            result.add(track.toString());
            return;
        }

        //接下来就是做选择了
        //尝试放一个左括号
        track.append('(');//做选择
        backtrack(left - 1, right, track, result);
        track.deleteCharAt(track.length() - 1);//撤销选择

        //尝试放一个右括号
        track.append(')');
        backtrack(left, right - 1, track, result);
        track.deleteCharAt(track.length() - 1);
    }
}

