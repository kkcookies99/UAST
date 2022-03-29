   public String XXX(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        String str = "";
        int skip1 = 0;
        int skip2 = 0;
        for (int i = 0; i < numRows; i++) {
            skip1 = i != numRows - 1 ? 2 * (numRows - i) - 2 : 2 * numRows - 2;
            if (i == 0 || i == numRows - 1) {
                int j = i;
                while (j <= s.length() - 1) {
                    str += s.charAt(j) + "";
                    j += skip1;
                }
            } else {
                skip2 = 2 * numRows - 2 - skip1;
                int k = 0, j = i;
                while (j <= s.length() - 1) {
                    k++;
                    str += s.charAt(j) + "";

                    if (k % 2 == 1) {
                        j += skip1;
                    } else {
                        j += skip2;
                    }
                }
            }
        }

        return str;
    }

