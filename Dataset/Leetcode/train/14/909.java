 class Solution {
    public String XXX(String[] strs) {
        String result = "";
        char charx;
        try{
            for(int i = 0; i < strs[0].length(); i ++){
                charx = strs[0].charAt(i);
                for(int j = 1; j < strs.length; j ++){
                    if(charx != strs[j].charAt(i)){
                        return result;
                    }
                }
                result += String.valueOf(charx);
        }
        }catch(Exception e){
            return result;
        }
        return result;
    }
}

