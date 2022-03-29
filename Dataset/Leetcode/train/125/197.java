 class Solution {
    public boolean XXX(String s) {
        int i = 0, j = s.length()-1;
        while ( i <= j ) {
            boolean front = isAlphabeatOrNumber(s.charAt(i));
            boolean back = isAlphabeatOrNumber(s.charAt(j));
            if ( front && back ) {
                if ( s.charAt(i) == s.charAt(j) 
                    || ( isAlphabeat(s.charAt(i)) && isAlphabeat(s.charAt(j))
                         && Math.abs(s.charAt(i) - s.charAt(j)) == 32) ) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            }
            if ( !front ) {
                i++;
            }
            if ( !back ) {
                j--;
            }
        }
        return true;
    }
    boolean isAlphabeatOrNumber(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') ||(c >= 'A' && c <= 'Z');
    }
    boolean isAlphabeat(char c) {
        return (c >= 'a' && c <= 'z') ||(c >= 'A' && c <= 'Z');
    }
}

