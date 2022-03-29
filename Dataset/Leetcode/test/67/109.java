 class Solution {
    public String XXX(String a, String b) {
        if(a == null || a.length() == 0) {
            return b;
        }
        if(b == null || b.length() == 0) {
            return a;
        }
        StringBuilder stb = new StringBuilder();
        int x = a.length() - 1;
        int y = b.length() - 1;

        int c = 0;
        while(x >= 0 || y >= 0) {
            if(x >= 0) {
                c += a.charAt(x--) - '0' ;
            }
            if(y >= 0) {
                c += b.charAt(y--) - '0';
            }      
            stb.append(c % 2);
            c >>= 1;
        }
        String res = stb.reverse().toString();
        return c > 0 ? '1' + res : res;
    }
}

