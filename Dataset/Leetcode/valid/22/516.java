 class Solution {
    public List<String> XXX(int n) {
        int l = 0,r = 0;
        List<String> ans  = new ArrayList<>();
        dfs(ans,l,r,n,new StringBuffer());
        return ans;
    }

    private void dfs(List<String> ans,int l ,int r,int n,StringBuffer sb){
        if(l>n||r>n) return;
        if(l == n && r == n){
            ans.add(sb.toString());
        }
        if(l>=r){
            sb.append("(");
            dfs(ans,l+1,r,n,sb);
            sb.deleteCharAt(sb.length() - 1);
            sb.append(")");
            dfs(ans,l,r+1,n,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

