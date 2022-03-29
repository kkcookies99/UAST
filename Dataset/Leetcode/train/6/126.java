 class Solution {
    public String XXX(String s, int numRows) {
        if (s.length() == 0 || s.length() == 1 || numRows == 1) {
            return s;
        }

        char[] chs = s.toCharArray();
        StringBuilder res = new StringBuilder();
        int interval = 2 * (numRows - 1);
        for (int i = 0; i < numRows; i++) {
            int flag1 = i;
            int flag2 = -1;
            if (i != 0 && i != numRows - 1) {
                flag2 = i + (numRows - i - 1) * 2;
            }
            while (flag1 < s.length() && flag2 < s.length()) {
                res.append(chs[flag1]);
                flag1 += interval;
                if (flag2 != -1) {
                    res.append(chs[flag2]);
                    flag2 += interval;
                }
            }
            if (flag1 < s.length()) {
                res.append(chs[flag1]);
            }
            if (flag2 != -1 && flag2 < s.length()) {
                res.append(chs[flag2]);
            }
        }
        return res.toString();
    }
}

