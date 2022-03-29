 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();
        int temp;
        for (int i = 0; i < numRows; i++) {
            temp = i;
            while (temp < chars.length) {
                sb.append(chars[temp]);
                temp = temp + numRows * 2 - 2;
                if (i != 0 && i != numRows -1) {
                    int pre = temp - i * 2;
                    if (pre < chars.length) {
                        sb.append(chars[pre]);
                    }
                }
            }

        }
        return sb.toString();
    }
}

