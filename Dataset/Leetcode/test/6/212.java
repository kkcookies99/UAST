 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < numRows; i ++) {
            for(int j = 0; j < s.length(); j ++) {
                int remainder = j % (2 * numRows - 2);
                if (remainder<numRows) {
                    if (remainder == i) {
                        sb.append(s.charAt(j));
                    }
                } else {
                    if((2 * numRows - 2-remainder)==i) {
                        sb.append(s.charAt(j));
                    }
                }
            }
        }
        
        return sb.toString();
    }
}

