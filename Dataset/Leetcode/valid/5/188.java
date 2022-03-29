 class Solution {
    public String XXX(String s) {
        int num = 0;
        String strings = "";
        if(s.length()==1 || "".equals(s)){
            return s;
        }
        if(PalindromicString(s)){
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(PalindromicString(s.substring(i,j+1))){
                    if(s.substring(i,j+1).length()>num){
                        num = s.substring(i,j+1).length();
                        strings = s.substring(i,j+1);
                    } 
                }
            }
        }
        if(num == 0){
            return s.substring(0,1);
        }
        return strings;
    }
    boolean PalindromicString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            if(chars[i]!=chars[chars.length-1-i]){
                return false;
            }
        }
        return true;
    }
}

