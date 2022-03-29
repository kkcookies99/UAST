 class Solution {
    public String XXX(String s) {
        int len = 0;
        String res = "";
        for (int i = 0; i < s.length(); i ++ ) {
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l -- ;
                r ++ ;
            }
            if (r - l - 1 > len) {
                len = r - l - 1;
                res = s.substring(l + 1, r);
            }

            l = i; r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l -- ;
                r ++ ;
            }
            if (r - l - 1 > len) {
                len = r - l - 1;
                res = s.substring(l + 1, r);
            }
        }
        return res;
    }
}

