 class Solution {
    public String XXX(String s, int numRows) {
    if (numRows < 2||s.length()<numRows) {
        return s;
    }
    int i;
    int size = (int) Math.ceil(s.length() / numRows * 2);
    char[][] chars = new char[numRows][size];
    int j = 0, count = 0;
    boolean flag = true;
    while (count < s.length()) {
        int len;
        len = numRows;
        if (flag) {
            i = j == 0 ? 0 : 1;
            while (count < s.length() && i < len) {
                chars[i][j] = s.charAt(count++);
                i++;
            }
        } else {
            i = numRows - 2;
            while (count < s.length() && i >= 0) {
                chars[i][j] = s.charAt(count++);
                i--;
            }
        }
        flag = !flag;
        j++;//往右移一列
    }
    StringBuilder sb = new StringBuilder();
    for (char[] aChar : chars) {
        for (int l = 0; l < aChar.length; l++) {
            if (aChar[l] != '\u0000') {
                sb.append(aChar[l]);
            }
        }
    }
    return sb.toString();
    }
}

