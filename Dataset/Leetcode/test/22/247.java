 class Solution {

    private List<String> ans = null;

    public List<String> XXX(int n) {
        ans = new ArrayList<>();    
        dfs(n, n, new StringBuilder());
        return ans;
    }

    private void dfs(int l, int r, StringBuilder sb){
        if (l == 0 && r == 0){
            ans.add(sb.toString());
            return;
        }
        if (l > 0){
            dfs(l - 1, r, sb.append("("));
            sb.deleteCharAt(sb.length() - 1);
        }
        if (r > 0 && r > l){
            dfs(l , r - 1, sb.append(")"));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

