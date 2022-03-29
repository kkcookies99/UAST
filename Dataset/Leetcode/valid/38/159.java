class Solution {
    public String XXX(int n) {
        String res = "1";
        return dfs(n-1,res);
    }

    public String dfs(int n,String res){
        if (n==0) return res;
        char tem = res.charAt(0);
        int count = 0;
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<res.length();i++){
            if (res.charAt(i) == tem){
                count++;
            }else{
                sb.append(count);
                sb.append(tem);
                count = 1;
                tem = res.charAt(i);
            }
            if (i==res.length()-1){
                sb.append(count);
                sb.append(tem);
            }
        }
        return dfs(n-1,sb.toString());
    }
}

