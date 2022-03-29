 class Solution {
    public boolean XXX(String s) {
        int a = 0, b = s.length() - 1;
        while(a < b) {
            char aChar = s.charAt(a);
            char bChar = s.charAt(b);
            if (!Character.isLetterOrDigit(aChar)) {
                a++;
                continue;
            }
            if (!Character.isLetterOrDigit(bChar)) {
                b--;
                continue;
            }
            if (Character.toLowerCase(aChar) != Character.toLowerCase(bChar)) {
                return false;
            } else {
                a++;
                b--;
            }
        }
        return true;
    }
}

