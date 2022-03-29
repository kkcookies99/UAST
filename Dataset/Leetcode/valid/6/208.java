 class Solution {
    public String XXX(String s, int numRows) {
        if (s.length() < 2||numRows==1) return s;
        StringBuilder res = new StringBuilder();
        int n = numRows - 1;
        int j = 0;
        for (int i = 0; i < s.length(); i += 2 * (numRows - 1)) {
            res.append(s.charAt(i));
        }
        for (int i = 1; i < numRows - 1; i++) {
            j = i;
            n = numRows - 1;
            while (j < s.length()) {
                res.append(s.charAt(j));
                j += 2 * (n - j);
                n += numRows-1;
            }
        }
        for (int i = numRows-1; i < s.length(); i += 2 * (numRows - 1)) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}

