 class Solution {
    List<String> res = new ArrayList<>();
    public List<String> XXX(int n) {
        dfs(n, n, new StringBuilder());
        return res;
    }
    void dfs(int left, int right, StringBuilder path){
        if(left > right || left < 0 || right < 0)return;
        if(left == 0 && right == 0){
            res.add(path.toString());
            return;
        }
        path.append('(');
        dfs(left - 1, right, path);
        path.deleteCharAt(path.length() - 1);
        path.append(')');
        dfs(left, right - 1, path);
        path.deleteCharAt(path.length() - 1);
    }
}

