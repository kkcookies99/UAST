 class Solution {
    private int n;
    private List<String> ans = new ArrayList<>();

    public List<String> XXX(int n) {
        this.n = n;
        dfs(0, 0, new StringBuilder());
        return ans;
    }

    private void dfs(int i, int j, StringBuilder sb){
        if(j==n){
            ans.add(sb.toString());
        }else{
            if(i<n){
                sb.append('(');
                dfs(i + 1, j, sb);
                sb.deleteCharAt(sb.length() - 1);
            }

            if(j<i){
                sb.append(')');
                dfs(i, j + 1, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}

