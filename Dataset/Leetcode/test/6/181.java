 class Solution {
    public String XXX(String s, int numRows) {
        String res = "";
        for (int i = 0; i < numRows; i++) {
            if (i != 0 && i != numRows - 1) {
                int j = i;
                while (j < s.length()) {
                    res += s.charAt(j);
                    if (j + 2 * (numRows - i - 1) > 0 && j + 2 * (numRows - i - 1) < s.length())
                        res += s.charAt(j + 2 * (numRows - i - 1));
                    j = j + (numRows - 1) * 2;
                }
            }
            else {
                int j = i;
                while (j < s.length() && res.length() < s.length()) {
                    res += s.charAt(j);
                    if (numRows != 1)
                        j = j + (numRows - 1) * 2;
                    else
                        j++;
                }
            }
        }
        return res;
    }
}

