 class Solution {
    public String XXX(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        int beginIdx = 0, len = 1;
        boolean[][] dp = new boolean[s.length()][s.length()];
        // i <= j - 1：说明只需填写右上部分表格
        // i==j时无需填写，因为条件j - i + 1 <= 3 表明字串长度<=3时，如果两
        //   端的字符相等就已经确定是回文串了，无需继续dp
        for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i <= j - 1; i++) {
                if (s.charAt(i) == s.charAt((j)) && (j - i + 1 <= 3 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if (j - i + 1 > len) {
                        beginIdx = i;
                        len = j - i + 1;
                    }
                }
            }
        }
        return s.substring(beginIdx, beginIdx + len);
    }
}

