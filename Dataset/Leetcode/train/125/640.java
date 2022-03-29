 class Solution {
    public boolean XXX(String s) {
        int i = 0, j = s.length() - 1;
        char l = 0, r = 0;
        while (i < j) {
            while (i < j && !isDigitOrLetter(l = s.charAt(i))) {
                i++;
            }
            while (i < j && !isDigitOrLetter(r = s.charAt(j))) {
                j--;
            }
            if (i++ < j-- && (l & 0xDF) != (r & 0xDF)) {
                return false;
            }
        }
        return true;
    }

    private boolean isDigitOrLetter(char c) {
        return c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
}

