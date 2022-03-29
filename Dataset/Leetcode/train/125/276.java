 class Solution {
    public boolean XXX(String s) {
        if(s.length() < 2 || s == null) return true;
        //s = s.toUpperCase(); //全转大写直接被"0P"搞懵了
        //因为'0'=48,如果转大写变成48+32=80，也就是"P"，"0P"也就变成"PP"，结果就变成true
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(!(s.charAt(left) >= '0' && s.charAt(left) <= '9' || s.charAt(left) >= 'a' && s.charAt(left) <= 'z')){
                ++left;
                continue;
            }
            if(!(s.charAt(right) >= '0' && s.charAt(right) <= '9' || s.charAt(right) >= 'a' && s.charAt(right) <= 'z')){
                --right;
                continue;
            }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }
}

