 class Solution {
    public String XXX(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        char[] res = strs[0].toCharArray();
        char[] res2 = null;
        int len = res.length;
        for(int i = 1; i < strs.length; i++){
            res2 = strs[i].toCharArray();
            len = Math.min(len, res2.length);
            for(int j = 0; j < len; j++){
                if(res[j] != res2[j]){
                    len = j;
                    break;
                }
            }
        }
        char[] result = new char[len];
        for(int k = 0; k < len; k++){
            result[k] = res[k];
        }
        String str = new String(result);
        return str;
    }
}

