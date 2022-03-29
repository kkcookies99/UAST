 class Solution {
    StringBuilder path = new StringBuilder();
    List<String> res = new ArrayList<>();
    public List<String> XXX(int n) {
        dfs(n, n);
        return res;
    }

    void dfs(int left, int right){
        if(left==0 && right ==0){
            res.add(path.toString());
            return;
        }
        if(left > 0){
            path.append("(");
            dfs(left-1, right);
            path.deleteCharAt(path.length()-1);
        }
        if(left < right){
            path.append(")");
            dfs(left, right-1);
            path.deleteCharAt(path.length()-1);
        }
    }
}

