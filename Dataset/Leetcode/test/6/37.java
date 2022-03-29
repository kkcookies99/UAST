     public String XXX(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < n; j += (numRows - 1) * 2) {
                sb.append(s.charAt(j));
                if (i > 0 && i < numRows - 1) {
                    int sec = j + 2 * (numRows - i - 1);
                    if (sec < n) {
                        sb.append(s.charAt(sec));
                    }
                }
            }
        }
        return sb.toString();
    }

