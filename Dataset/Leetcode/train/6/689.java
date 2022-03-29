 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder rets = new StringBuilder();

        int col = (s.length() - 1) / (2 * numRows - 2) + 1;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0) {
                    rets.append(s.charAt(j * (2 * numRows - 2)));
                    continue;
                }

                int m = j * (2 * numRows - 2) + i;
                int n = (j + 1) * (2 * numRows - 2) - i;

                if (m < s.length() && m <= n) {
                    rets.append(s.charAt(m));
                }

                if (n < s.length() && n > m) {
                    rets.append(s.charAt(n));
                }
            }
        }

        return rets.toString();
    }
}

