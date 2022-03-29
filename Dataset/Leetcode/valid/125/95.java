 class Solution {
    public boolean XXX(String s) {
        s = s.replace(" ", "");
        s = s.toLowerCase();
        for (int i = 0, j = s.length() -1; i < j;) {
            char ic = s.charAt(i);
            char jc = s.charAt(j);
            if (!((ic >= 'a' && ic <= 'z') || (ic >= '0' && ic <= '9'))) {
                i++;
                continue;
            }
            if (!((jc >= 'a' && jc <= 'z') || (jc >= '0' && jc <= '9'))) {
                j--;
                continue;
            }
            if (jc != ic) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

