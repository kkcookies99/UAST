 class Solution {
    public String XXX(int n) {
        if (n == 1) return "1";
        if (n == 2) return "11";
        int count = 3;
        String prestr = "11";
        while (count++ <= n) {
            char[] chars = prestr.toCharArray();
            StringBuilder sb = new StringBuilder();
            char preChar = chars[0];
            int tempCount = 1;
            for (int i = 1; i < chars.length; i++) {
                if (preChar == chars[i]) {
                    tempCount++;
                } else {
                    sb.append(tempCount).append(preChar);
                    preChar = chars[i];
                    tempCount = 1;
                }
            }
            sb.append(tempCount).append(preChar);
            prestr = sb.toString();
        }
        return prestr;
    }
}

