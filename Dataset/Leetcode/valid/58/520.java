class Solution {
    public int XXX(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                for (int j = 0; ; j++) {
                    if (i - j < 0 || s.charAt(i - j) == ' ') {
                        return j;
                    }
                }
            }
        }
        return 0;
    }
}

