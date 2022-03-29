 class Solution {
    public boolean XXX(String s) {
        int l = 0,r = s.length() - 1;
        if(r <= 0){
            return true;
        }
        while(l <= r){
            while(!(s.charAt(l) <= 'z' && s.charAt(l) >= 'a') && !(s.charAt(l) <= 'Z' && s.charAt(l) >= 'A') && !(s.charAt(l) <= '9' && s.charAt(l) >= '0')){
                l++;
                if(l == s.length())return true;
            }
            while(r > 0 && !(s.charAt(r) <= 'z' && s.charAt(r) >= 'a') && !(s.charAt(r) <= 'Z' && s.charAt(r) >= 'A') && !(s.charAt(r) <= '9' && s.charAt(r) >= '0')){
                r--;
                if(r == -1)return true;
            }
            char a = s.charAt(l),b = s.charAt(r);
            if(a <= 'Z' && a >= 'A'){
                a = (char)(a + 32);
            }
            if(b <= 'Z' && b >= 'A'){
                b = (char)(b + 32);
            }
            if(a != b){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

