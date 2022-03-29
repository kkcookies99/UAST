 class Solution {
    public boolean XXX(String s) {
        if(s == null){
            return false;
        }
        s = s.toLowerCase();
        int l = 0,r = s.length()-1;
        while(l < r){
            if(!isNumOrStr(s.charAt(l))){
                l++;
                continue;
            }
            if(!isNumOrStr(s.charAt(r))){
                r--;
                continue;
            }
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isNumOrStr(char c){
        if(c >= '0' && c <= '9'){
            return true;
        }
        if(c >= 'a' && c <= 'z'){
            return true;
        }
        return false;
    }
}

