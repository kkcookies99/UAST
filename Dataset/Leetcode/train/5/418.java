 class Solution {

    public String XXX(String s) {
        int start = 0, end = 0, maxLength = 1;
        //dp[i][j]：字符串s[i, j]是否是回文子串
        boolean[][] dp = new boolean[s.length()][s.length()];
        //任何长度为1的子序列都是回文子串
        for (int i = 0; i < s.length(); i++) dp[i][i] = true;

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                //j-i<=2：如果只有三个字符，且两端相等，则不需要判断最里层就知道是回文 aba；当前字符相等且内部子串是回文：dp[i + 1][j - 1]
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if (dp[i][j] && maxLength < j - i + 1) {
                        start = i;
                        end = j;
                        maxLength = j - i + 1;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }
}

