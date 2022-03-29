 class Solution {
    public String XXX(String s, int numRows) {
  		if (numRows == 1 || numRows >= s.length()) {
			return s;
		}
        char[] chars = new char[s.length()];
        int colLen = 2 * numRows - 2;  //每列的长度
        if(colLen==0) colLen=1;
        int n = s.length();
        int index;
        int minCol = n / colLen;   //共有多少完整列
        int ci = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < minCol + 1; j++) {
                index = j * colLen + i;
                if (index < s.length()) {
                    chars[ci++] = s.charAt(index);
                }
                if (i != 0 && i != numRows - 1) {
                    index = j * colLen + i + 2 * (numRows - i - 1);
                    if (index < s.length())
                        chars[ci++] = s.charAt(index);
                }
            }
        }
        return String.valueOf(chars);
    }
}
