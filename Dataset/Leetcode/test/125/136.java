     public boolean XXX(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        int length = chars.length;
        int end = length - 1;
        for (int i = 0; i < end; i++) {
            char c = chars[i];
            char endChar = chars[end];
            if (!valid(c)) {
                continue;
            }
            if (!valid(endChar)) {
                end--;
                i--;
                continue;
            }
            if (c >= 97 && c <= 122) {
                c -= 32;
            }
            if (endChar >= 97 && endChar <= 122) {
                endChar -= 32;
            }
            if (c != endChar) {
                return false;
            }
            end--;
        }
        return true;
    }

