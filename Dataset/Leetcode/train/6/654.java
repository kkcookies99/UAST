 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        int diff = numRows * 2 - 2;
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numRows; ++i) {
            if(i == 0 || i == numRows - 1) {
                for(int j = i; j < cs.length; j += diff) {
                    sb.append(cs[j]);
                }
            }

            else {
                for(int j = i, k = diff - i; j < cs.length || k < cs.length; j += diff, k += diff) {
                    if(j < cs.length) sb.append(cs[j]);
                    if(k < cs.length) sb.append(cs[k]);
                }
            }
        }

        return sb.toString();
    }
}

