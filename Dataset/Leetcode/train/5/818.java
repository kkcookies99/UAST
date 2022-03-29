 class Solution {
    public String XXX(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];

        int l = 0, r = 0;
        for (int j = 0; j < n; j++) {
            isPalindrome[j][j] = true;
            for (int i = j - 1; i >= 0; i--) {
                if (s.charAt(i) == s.charAt(j) && 
                            (i == j - 1 || isPalindrome[i + 1][j - 1])) {
                    isPalindrome[i][j] = true;
                    if (j - i > r - l) {
                        l = i;
                        r = j;
                    } 
                }
            }
        }
        return s.substring(l, r + 1);
    }
}

