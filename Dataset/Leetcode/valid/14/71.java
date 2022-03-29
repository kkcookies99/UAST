 class Solution {
    public String XXX(String[] strs) {
        StringBuilder res = new StringBuilder();
        if(strs == null || strs.length == 0) return res.toString();
        for(int i = 0; i < strs[0].length(); i++){
            char tmp = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){ 
                if(i >= strs[j].length() || strs[j].charAt(i) != tmp)  return res.equals(null) ? "" : res.toString();
            }//charAt(i)注意越界的情况
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }
}

