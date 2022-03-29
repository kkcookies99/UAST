 class Solution {
     List<String> list=new ArrayList();
     StringBuilder sb=new StringBuilder();
     int n;

    public List<String> XXX(int n) {
        this.n=n;
        dfs(0,0);
        return list;
    }
   public void dfs(int left,int right){
        if(left==n&&right==n){
            list.add(sb.toString());
            return ;
        }
        if(left>n||left<right){
            return;
        }
        sb.append('(');
        dfs(left+1,right);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        dfs(left,right+1);
        sb.deleteCharAt(sb.length()-1);
       


   }
 

}

