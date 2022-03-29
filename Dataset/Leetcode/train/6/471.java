 class Solution {
    public String XXX(String s, int numRows) {
        String result = "";
        if (numRows == 1) {
            return s;
        }
        char[][] ch = new char[s.length()][s.length()];
        char[] StringToCharArray = s.replace("\"", "").toCharArray();

        int i = 0;
        int cyc = 0;
        for (int x = 0; x < s.length(); x++) {
            for (int y = 0; y < numRows; y++) {
                if (x == 0 || x % (numRows - 1) == 0) {
                    // 写完一整列
                    if (i == StringToCharArray.length) {
                        break;
                    }
                    if (numRows - 1 == y) {
                        cyc++;
                    }
                    ch[x][y] = StringToCharArray[i++];
                } else {
                    if (i == StringToCharArray.length) {
                        break;
                    }
                    if (numRows * cyc - x - cyc == y) {
                        ch[x][y] = StringToCharArray[i++];
                    }
                }
            }
        }

        for (int j = 0; j < s.length(); j++) {
            for (int k = 0; k < s.length(); k++) {
                if (ch[k][j] != '\u0000') {
                    result += ch[k][j];
                }
            }
        }
        return result;
    }
} 

