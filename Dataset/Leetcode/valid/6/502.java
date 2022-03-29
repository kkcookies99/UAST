 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int midRange = 2 * (numRows - 2), point = 0, len = s.length();
        for (int i = 0; i < numRows; i++, point = i) {
            while (point < len  && sb.length() < len) {
                sb.append(s.charAt(point));
                if (i > 0 && i < numRows - 1 && point + midRange < len) {
                    sb.append(s.charAt(point + midRange));
                }
                point = point + 2 * numRows - 2;
            }
             if (i > 0 && i < numRows - 1) midRange -= 2;
        }
        return sb.toString();
    }
}

