 class Solution {
    public String XXX(String s, int numRows) {
        if (s.length() < numRows || numRows == 1) {
            return s;
        }
        StringBuilder builder = new StringBuilder(s.length());
        int bridge = 2 * numRows - 2;
        for (int i = 0; i < s.length(); i += bridge) {
            builder.append(s.charAt(i));
        }
        for (int i = 1; i < numRows - 1; i++) {
            for (int j = 0; j * bridge < s.length(); j++) {
                if (j * bridge + i < s.length()) {
                    builder.append(s.charAt(j * bridge + i));
                }
                if (j * bridge + (bridge - i) < s.length()) {
                    builder.append(s.charAt(j * bridge + (bridge - i)));
                }
            }
        }
        for (int i = numRows - 1; i < s.length(); i += bridge) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}

