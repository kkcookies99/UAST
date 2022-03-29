 class Solution {
    public String XXX(String s) {
        if (s.length() == 0) {
            return s;
        }
        int length = s.length();
        int left = 0;
        int right = 0;
        //代表从第i个字符到第j个字符
        boolean[][] bl = new boolean[length][length];
        //单个字符肯定是true
        for (int i = 0; i < length; i++) {
            bl[i][i] = true;
            for (int j = 0; j < i; j++) {
                if (i - j <= 1) {
                    bl[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    bl[i][j] = s.charAt(i) == s.charAt(j) && bl[i - 1][j + 1];
                }
                if (bl[i][j]) {
                    if (i - j > right - left) {
                        right = i;
                        left = j;
                    }
                }
            }
        }
        return s.substring(left, right + 1);
    }
}

