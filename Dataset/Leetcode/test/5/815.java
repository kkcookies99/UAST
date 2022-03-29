 class Solution {
    public String XXX(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int count = 1;
        char[] chs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(chs[0]);

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (chs[i] == chs[j] && ((i - j <= 2) || dp[i - 1][j + 1])) {
                    dp[i][j] = true;
                    int cur_len = i - j + 1;
                    if (cur_len > count) {
                        count = cur_len;
                        sb = new StringBuilder();
                        for (int m = j; m <= i; m++) {
                            sb.append(chs[m]);
                        }
                    }
                }
            }
        }

        return sb.toString();
    }
}

