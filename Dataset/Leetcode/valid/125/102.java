 class Solution {
    public boolean XXX(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(!isLetterOrNumber(a)) {
                i++;                
            } else if(!isLetterOrNumber(b)) {
                j--;
            } else if(a == b || a - b == 32 && b >= 'A' || b - a == 32 && a >= 'A') {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isLetterOrNumber(char c) {
        return c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }
}

