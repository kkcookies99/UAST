class Solution {
    public int XXX(String s) {
        s = s.trim();
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) != ' ')
            i--;
        if (i == -1) {
            return s.length();
        } else {
            return s.length() - 1 - i;
        }
    }
}

