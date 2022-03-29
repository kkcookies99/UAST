 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        dfs(n,res,"",0,0);
        return res;
    }
    public void dfs(int n ,List<String> res,String path,int left,int right){
        if(left>n||right>left){return ;}
        if(path.length()==2*n){
            res.add(path);
            return ;
        }
        dfs(n,res,path+"(",left+1,right);
        dfs(n,res,path+")",left,right+1);
    }
}

