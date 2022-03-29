 class Solution {
    private List<String> res;
    private int n;
    public List<String> XXX(int n) {
        res = new ArrayList<>();
        this.n = 2 * n;
        StringBuilder sb = new StringBuilder();
        dfs(0, sb, 0 , 0);
        return res;
    }

    public void dfs(int index, StringBuilder sb, int left, int right){
        if (left > n / 2 || right > n / 2 || right > left){
            return ;
        }

        if (index == n){
            res.add(new String(sb));
            return ;
        }
        dfs(index + 1, sb.append('('), left + 1, right);
        sb.deleteCharAt(sb.length() - 1);
        dfs(index + 1, sb.append(')'), left, right + 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}

