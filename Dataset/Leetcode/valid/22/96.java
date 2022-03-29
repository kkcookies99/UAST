 class Solution {

    public List<String> XXX(int n) {
        List<String> rs = new ArrayList<>();
        StringBuffer path = new StringBuffer(n);
        dfs(n,n,path,rs);
        return rs;
    }

    void dfs(int l, int r, StringBuffer path , List<String> rs){
        //System.out.println("l="+l+",r="+r);

        // 有效结束
        if(l == r && l==0){
            rs.add(path.toString());
            return;
        }

        // 无效提前结束
        if(l > r){
            return;
        }

        if(l > 0){
            dfs(l-1,r,path.append('('),rs);
            path.setLength(path.length()-1);
            dfs(l,r-1,path.append(')'),rs);
            path.setLength(path.length()-1);
            
        }else{
            dfs(l,r-1,path.append(')'),rs);
            path.setLength(path.length()-1);
        }
        // l >= r
    }
}

