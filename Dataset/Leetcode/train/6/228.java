 class Solution {
    public String XXX(String s, int numRows) {
        int length = s.length();
        if (numRows < 1) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int l = (int) Math.ceil((double) length / 2);
        char[][] array = new char[numRows][l];
        int x = 0;
        int y = 0;
        int n = 1;
        boolean m = true;
        for (int i = 0; i < length; i++) {
            array[x][y] = chars[i];
            if (n >= numRows) {
                n = 1;
                m = !m;
            }
            if (m) {
                x++;
            } else {
                x--;
                y++;
            }
            n++;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < l; j++) {
                if (array[i][j] != '\u0000') {
                    res.append(array[i][j]);
                }
            }
        }
        return res.toString();
    }
}


