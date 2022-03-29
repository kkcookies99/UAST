 class Solution {
    public String XXX(String a, String b) {
        int m = a.length(), n = b.length();
        int gap = m - n;
        String ss = "";
        if ( gap > 0 ) {
            for ( int i = 0; i < gap; i++ ) {
                ss += "0";
            }
            ss += b;
            b = ss;
        } else {
            for ( int i = 0; i < -gap; i++ ) {
                ss += "0";
            }
            ss += a;
            a = ss;
        }
        StringBuilder sb = new StringBuilder();
        boolean carry = false;
        for ( int j = a.length()-1; j >= 0; j-- ) {
            int sum = a.charAt(j)-'0' + b.charAt(j)-'0';
            if ( carry ) {
                sum ++;
                carry = false;
            }
            if ( sum > 1 ) {
                carry = true;
                sb.append(sum%2);
            } else {
                sb.append(sum);
            }
        }
        if ( carry ) {
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}

