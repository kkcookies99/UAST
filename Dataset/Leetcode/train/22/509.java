 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, new StringBuilder(), n, n);
        return res;
    }

    private void dfs(List<String> res, StringBuilder sb, int lnum, int rnum){
        for(int i = 1; i <= lnum; i++){
            for(int j = 1; rnum - j >= lnum - i; j++){
                if(i == lnum){
                    j = rnum;
                }
                sb.append("(".repeat(i));
                sb.append(")".repeat(j));
                if(i != lnum){
                    dfs(res, sb, lnum - i, rnum - j);
                }else{
                    res.add(sb.toString());
                }
                sb.delete(sb.length() - (i + j), sb.length());
            }
        }
    }
}

