 class Solution {
    public boolean XXX(String s) {
        char[] carr = s.toCharArray();
        int l = 0, r = carr.length - 1;
        while (l < r) {
            while (l < r && !isChar(carr[l]) && !isDigit(carr[l])) l++;
            while (l < r && !isChar(carr[r]) && !isDigit(carr[r])) r--;
            if (!isSame(carr[l],carr[r])) return false;
            l++;
            r--;
        }
        return true;
    }

    boolean isChar(char ch) {
        return 'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z';
    }

    boolean isDigit(char ch) {
        return '0' <= ch && ch <= '9';
    }

    boolean isSame(char ch1, char ch2) {
        if (isChar(ch1) && isChar(ch2))
            return ch1 == ch2 || ch1 - ch2 == 32 || ch2 - ch1 == 32;
        else return ch1 == ch2;
    }
}

