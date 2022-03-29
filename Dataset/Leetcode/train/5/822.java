 class Solution {
    public String XXX(String s) {
        if (s == null || s.length() <= 1) return s;
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }
        int start = 0;
        int end = 0;
        int max = 1;
        for (int i = length - 1; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = j - i == 1 || dp[i + 1][j - 1];
                    //判断是否可取
                    if (dp[i][j] && max <= j - i) {
                        start = i;
                        end = j;
                        max = j - i;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }
}

