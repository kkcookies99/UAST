 class Solution {
    public boolean XXX(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !isNumber(s.charAt(left)) && !isLetter(s.charAt(left))) ++left;
            while (left < right && !isNumber(s.charAt(right)) && !isLetter(s.charAt(right))) --right;
            if (left < right) {
                if (equals(s.charAt(left), s.charAt(right))) {
                    ++left;
                    --right;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    private boolean equals(char c1, char c2) {
        if (isLetter(c1) && isLetter(c2)) {
            return c1 == c2 || Math.abs(c1 - c2) == 'a' - 'A';
        } else {
            return c1 == c2;
        }
    }
}

