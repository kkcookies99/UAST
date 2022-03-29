 class Solution {
    public boolean XXX(String s) {
        if (s.equals("")) return true;
        s = s.toLowerCase();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char cl = s.charAt(l), cr = s.charAt(r);
            if (isLegal(cl) && isLegal(cr) && cl == cr) {
                l ++;
                r --;
            } else {
                if (!isLegal(cl)) l ++;
                if (!isLegal(cr)) r --;
                if (isLegal(cl) && isLegal(cr) && cl != cr) return false;
            }
        }
        return true;
    }

    boolean isLegal(char c) {
        return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
    }
}

