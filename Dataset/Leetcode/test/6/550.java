 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1)
            return s;
        int len = s.length();
        StringBuilder result = new StringBuilder();
        int p = 0;
        while (p < len) {
            result.append(s.charAt(p));
            p += numRows * 2 - 2;
        }
        for (int i = 1; i < numRows - 1; i++) {
            p = i;
            while (p < len) {
                result.append(s.charAt(p));
                p += 2 * (numRows - i) - 2;
                if (p >= len)
                    break;
                result.append(s.charAt(p));
                p += 2 * i;
            }
        }
        p = numRows - 1;
        while (p < len) {
            result.append(s.charAt(p));
            p += numRows * 2 - 2;
        }
        return result.toString();
    }
}

