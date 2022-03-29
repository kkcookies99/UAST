 class Solution {
    public List<String> XXX(int n) {
        char[] candidates = new char[] {'(', ')'};
        StringBuilder track = new StringBuilder();

        dfs(candidates, track, n, 0, 0);

        return res;
    }

    private List<String> res = new LinkedList<>();

    //left, right 分别记录当前track中左括号和右括号的数量
    private void dfs(char[] candidates, StringBuilder track, int n, int left, int right) {
        //去除不符合条件的结果，剪枝
        if (left > n || right > left) return;

        if (track.length() == 2*n) {
            res.add(track.toString());
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            //选择
            track.append(candidates[i]);

            if (candidates[i] == '(') {
                dfs(candidates, track, n, left + 1, right);
            } else if (candidates[i] == ')') {
                dfs(candidates, track, n, left, right + 1);
            }

            //撤销
            track.deleteCharAt(track.length() - 1);
        }
    } 
}

