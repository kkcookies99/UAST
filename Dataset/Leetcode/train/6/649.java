 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder builder = new StringBuilder();
        int step = 2 * numRows - 2;
        int length = s.length();
        StringBuilder line = new StringBuilder();
        for (int j = 0; step * j < length; j++) {
            line.append(s.charAt(j * step));
        }
        builder.append(line.toString());
        for (int i = 1; i < numRows - 1; i++) {
            line = new StringBuilder();

            for (int j = 0; step * j - i < length; j++) {
                if ((step * j) - i > 0) {
                    line.append(s.charAt(step * j - i));
                }
                if ((step * j) + i < length) {
                    line.append(s.charAt(step * j + i));
                }
            }
            builder.append(line.toString());
        }
        line = new StringBuilder();
        for (int j = 0; step * j < length; j++) {
            if (step * j + numRows -1 < length) {
                line.append(s.charAt(j * step + numRows - 1));
            }
        }
        builder.append(line.toString());
        return builder.toString();
    }
}

