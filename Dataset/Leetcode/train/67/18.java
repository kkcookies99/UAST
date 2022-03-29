 class Solution {
    public String XXX(String a, String b) {
        // 先补0到一样长
        int shortestLen = (a.length() > b.length() ? b.length() : a.length());
        if (a.length() > b.length()) {
            b = generateZero(a.length() - shortestLen) + b;
        } else {
            a = generateZero(b.length() - shortestLen) + a;
        }

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int ascii_0 = (int) '0';
        int carry = 0;

        StringBuilder result = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            int flag = (aChar[i] - ascii_0) + (bChar[i] - ascii_0) + carry;
            result.append((char) (flag % 2 + ascii_0));
            if (flag >= 2)
                carry = 1;
            else
                carry = 0;
        }

        if (carry == 1)
            result.append("1");
        return result.reverse().toString();
    }

    public String generateZero(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        while (n-- > 0) {
            stringBuffer.append("0");
        }
        return stringBuffer.toString();
    }
}

