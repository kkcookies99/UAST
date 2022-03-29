 class Solution {
    public String XXX(String s, int numRows) {
        if (s.length() <= 1 || numRows <= 1) {
            return s;
        }
        
        StringBuilder builder = new StringBuilder();
        for (int i = 0, step = (numRows - 1) << 1; i < numRows; ++i) {
            for (int j = i, backward = i << 1; j < s.length(); j += step) {
                builder.append(s.charAt(j));
                if (i == 0 || i == numRows - 1) continue;

                int idx = j + step - backward;
                if (idx < s.length()) {
                    builder.append(s.charAt(idx));
                }
            }
        }
        
        return builder.toString();
    }
}

