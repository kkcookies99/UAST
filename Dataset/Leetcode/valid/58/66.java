 class Solution {
    public int XXX(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (len > 0) return len;
            } else {
                len++;
            }
        }
        return len;
    }
}

