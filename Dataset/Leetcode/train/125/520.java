     public boolean XXX(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while(l < r && !checkNumAlpha(s.charAt(l))){
                l++;
            }
            while(l < r && !checkNumAlpha(s.charAt(r))){
                r--;
            }
            if (l<=r && !ignoreCaseEq(s.charAt(l++), s.charAt(r--))) {
                return false;
            }
        }
        return true;
    }

    //校验是否数字/字母
    private boolean checkNumAlpha(char c){
        return (c >= '0' && c<='9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    //忽略大小判断是否相等
    private boolean ignoreCaseEq(char c1, char c2){
        return c1 == c2 || (c1 >= 'a' ? c1-'a' : c1-'A') == (c2 >= 'a' ? c2-'a' : c2-'A');
    }

