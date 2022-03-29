 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        if (s.length() <= numRows) {
            return s;
        }
        String [] strs = new String[numRows];
        for(int i = 0; i < numRows; i++) {
            strs[i] = "";
        }
        for(int i = 0; i < s.length(); i++) {
            if (i % (numRows * 2 - 2) == 0) {
                strs[0] += s.charAt(i);
            } else if (i % (numRows * 2 - 2 ) == numRows -1) {
                strs[numRows - 1] += s.charAt(i);
            } else {
                int index = i % (numRows * 2 - 2);
                int row = index >= numRows ? (numRows * 2 - 2 - index) : index;
                strs[row] += s.charAt(i);
            }
        }

        String res = "";
        for(int i = 0; i < strs.length; i++) {
            res += strs[i];
        }
        return res;
    }
}

