 class Solution {
    public boolean XXX(String s) {
        int p1 = 0, p2 = s.length() - 1;
        int l = 'a' - 'A';
        char a,b;
        while(p1<p2) {
            a = s.charAt(p1);
            b = s.charAt(p2);
            if (!((a >= 'a' && a <= 'z') || (a >= 'A' && a <='Z') || (a >= '0' && a <= '9'))) {
                p1++;
                continue;
            }
            if (!((b >= 'a' && b <= 'z') || (b >= 'A' && b <='Z')|| (b >= '0' && b <= '9'))) {
                p2--;
                continue;
            }            
            if (a == b || (a >= 'A' && b>='A' &&(Math.abs(a - b) == l))) {
                p1++;
                p2--;
            } else {
                return false;
            }
        }
        return true;
    }
}

