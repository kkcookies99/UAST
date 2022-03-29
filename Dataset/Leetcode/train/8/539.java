 class Solution {
    public static int XXX(String s){
        s = s.trim();
        int i = 0;
        for (i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9')
                && !(s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9')) {
                break;
            }
        }
        if(s.length() == 0) {
            return 0;
        }

        s = s.substring(0, i+1);
        java.math.BigInteger min = new java.math.BigInteger("-2147483648");
        java.math.BigInteger max = new java.math.BigInteger("2147483647");
        try {

            java.math.BigInteger b = new java.math.BigInteger(s);
            if (b.compareTo(min) == -1) {
                return -2147483648;
            } else if (b.compareTo(max) == 1) {
                return 2147483647;
            } else {
                return b.intValue();
            }
        } catch (Exception e) {
            return 0;
        }


    }
}

