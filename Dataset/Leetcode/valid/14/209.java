 class Solution {
    public String XXX(String[] strs) {
        int n = strs.length;
        if(n==0) return "";
        String res = strs[0];
        for(int i=1;i<n;i++){
            while(!strs[i].startsWith(res)){
                res=res.substring(0,res.length()-1);
            }
            if(res.equals("")) return "";
        }
        return res;
    }
}