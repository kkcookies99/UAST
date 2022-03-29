 class Solution {
    public List<String> XXX(int n) {
        List<String> ans = new ArrayList<>();
        dfs(0, n * 2, 0, n, "", ans);
        return ans;
    }

    /**
    * i: 当前遍历到位置
    * n: 字符总长度
    * score: 当前得分，令 '(' 为 1， ')' 为 -1
    * max: 最大得分值
    * path: 当前的拼接结果
    * ans: 最终结果集
    */
    void dfs(int i, int n, int score, int max, String path, List<String> ans) {
        if (i == n) {
            if (score == 0) ans.add(path);
        } else {
            if (score + 1 <= max) dfs(i + 1, n, score + 1, max, path + "(", ans);
            if (score - 1 >= 0) dfs(i + 1, n, score - 1, max, path + ")", ans);
        }
    }
}

