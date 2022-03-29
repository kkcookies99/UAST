 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1) return s;
        String s1 = "";
        int len = s.length();
        int col = (len / (numRows * 2 - 2) + 1) * (numRows - 1);

        char[][] chars = new char[numRows][col];
        int n = 0, i = 0, j = 0;
        while (n < len){
            while (i < numRows && n < len){
                chars[i++][j] = s.charAt(n++);
            }i--;
            while (--i >= 0 && n < len){
                chars[i][++j] = s.charAt(n++);
            }i += 2;
        }
        for (i = 0; i < numRows; i++){
            for (j = 0; j < col; j++){
                if(chars[i][j] != 0){
                    s1 += String.valueOf(chars[i][j]);
                }
            }
        }
        return s1;

    }
}

