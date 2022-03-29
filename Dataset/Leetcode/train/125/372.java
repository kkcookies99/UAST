 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i <= j) {
            while (i < chars.length && (!Character.isLetter(chars[i]) && !Character.isDigit(chars[i]))) {
                ++i;
            }
            while (j >= 0 && (!Character.isLetter(chars[j]) && !Character.isDigit(chars[j]))) {
                --j;
            }
            if (i >= j) return true;
            if (Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}

