 class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> XXX(int n) {
        dfs(new StringBuilder(),n,n);
        return ans;
    }
    public void dfs(StringBuilder sb,int left,int right){
        if(left<0||right<0||left>right) return;
        if(left==0&&right==0){
            ans.add(sb.toString());
        }
        for(int i=0;i<2;i++){
            if(i==0){
                sb.append("(");
                dfs(sb,left-1,right);
            }
            else{
                sb.append(")");
                dfs(sb,left,right-1);
            }
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

