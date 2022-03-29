     public String XXX(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int index = i;
            int k = 1;
            if (i == 0 || i == numRows - 1) {
                while (index < s.length()) {
                    builder.append(s.charAt(index));
                    index = i + k * (2 * numRows - 2);
                    k++;
                }
            } else {
                while (index < s.length()) {
                    builder.append(s.charAt(index));
                    index = 2 * (k - 1) * (numRows - 1) + 2 * numRows - 2 - i;
                    if (index < s.length()) {
                        builder.append(s.charAt(index));
                    } else {
                        break;
                    }
                    index = i + k * (2 * numRows - 2);
                    k++;
                }
            }
        }
        return builder.toString();
    }


