 class Solution {
    public String XXX(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String res = strs[0];
        for(String str:strs){
            while(!str.startsWith(res)){
                res = res.substring(0, res.length()-1);
            }
        }
        return res;
    }
}```

