 class Solution {
    public String XXX(String s) {
        int length = s.length();
        int[][] dp = new int[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = 1;
        }
        int begin = 0, max = 1;
        for (int i = 1; i < length; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                dp[i - 1][i] = 1;
                begin = i - 1;
                max = 2;
            }
        }
        for (int i = 3; i <= length; i++) {
            for (int j = 0, end = j + i - 1; end < length; j++, end++) {
                if (s.charAt(j) == s.charAt(end) && dp[j + 1][end - 1] == 1) {
                    dp[j][end] = 1;
                    begin = j;
                    max = i;
                }
            }
        }
        return s.substring(begin, begin + max);
    }
}

