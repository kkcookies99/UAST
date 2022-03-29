 class Solution {
    public String XXX(String s, int numRows) {

        if (numRows <= 1) return s;

        int left = (numRows - 1) << 1;
        int right = 0;
        int row = 0;
        char[] newS = new char[s.length()];

        for (int i = 0, j = 0; i < s.length();) {

            if (left != 0 && j < s.length()) {
                newS[i++] = s.charAt(j);
                j += left;
            }

            if (right != 0 && j < s.length()) {
                newS[i++] = s.charAt(j);
                j += right;
            }

            if (j >= s.length()) {
                left -= 2;
                right += 2;
                row++;
                j = row;
            }
        }

        return new String(newS);
    }
}

