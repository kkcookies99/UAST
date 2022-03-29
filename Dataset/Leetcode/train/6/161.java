 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder string = new StringBuilder(); 
        int range = (int) Math.ceil(s.length() / (2.0 * (numRows - 1)));

        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i < range; i++) {
                int index = 2 * i * (numRows - 1) + j;
                if (index > s.length() - 1) {
                    break;
                }
                string.append(s.charAt(index));
                if (j > 0 && j < numRows - 1) {
                    int index1 = 2 * (i + 1) * (numRows - 1) - j;
                    if (index1 > s.length() - 1) {
                        break;
                    }
                    string.append(s.charAt(index1));
                } 
            }
        }
        return string.toString();
    }
}

