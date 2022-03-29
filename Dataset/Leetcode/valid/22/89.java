 class Solution {
    List<String> ans;
    public List<String> XXX(int n) {
        ans = new ArrayList<>();
        dfs(n,"",0,0);
        return ans;
    }
    public void dfs(int n,String s,int left,int right){
        if(left+right==2*n){
            ans.add(s);
        }
        if(left<n)
            dfs(n,s+'(',left+1,right);
        if(left>right){
            dfs(n,s+')',left,right+1);
        }
    }
}