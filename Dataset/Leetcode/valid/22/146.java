 class Solution {
    List<String> res=new ArrayList<>();
    public List<String> XXX(int n) {
        dfs("",0,0,n);
        return res;
    }
    // s 当前组合  l:左括号数 r:右括号数
    private void dfs(String s,int l,int r,int n){
        // terminate
        if(l==r&&r==n){
            res.add(s);
            return;
        }
        // process & drill down
        if(r<l){
            dfs(s+")",l,r+1,n);
        }
        if(l<n){
            dfs(s+"(",l+1,r,n);
        }
    }
}

