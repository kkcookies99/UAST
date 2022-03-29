class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) return s;
        int len = s.length();
        StringBuilder sb = new StringBuilder(len);
        int index = numRows + numRows - 2;
        int count = 0;
        int po = 0;
        while (count < numRows) {
            int sum = index * po + count;
            int sum1 = index * (po + 1) - count;
            if (sum < len) {
                sb.append(s.charAt(sum));
                if (count > 0 && count < numRows - 1 && (sum1) < len)
                    sb.append(s.charAt(sum1));
                po++;
            } else {
                count++;
                po = 0;
            }
        }
        return sb.toString();
    }
}

