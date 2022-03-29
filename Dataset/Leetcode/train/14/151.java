 class Solution {
    public String XXX(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String result = strs[0];
        while(result != ""){
            for(int i = 1; i < strs.length; i++){
                if(strs[i].indexOf(result) == -1){
                    result = result.substring(0, result.length()-1);
                    break;
                }
                if(i == strs.length-1 && strs[i].indexOf(result) != -1){
                    return result;
                }
            }
        }
        return "";
    }
}

