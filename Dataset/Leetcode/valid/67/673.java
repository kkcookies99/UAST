class Solution {
    public String XXX(String a, String b) {
        int n = a.length(), m = b.length();
        if (n == 0) return b;
        if (m == 0) return a;
        StringBuilder sb = new StringBuilder();
        int i = n-1, j = m-1, c = 0;
        while (i >= 0 || j >= 0) {
            int num1 = 0, num2 = 0;
            if (i < 0) {
                num2 = b.charAt(j) - '0';
            } else if (j < 0) {
                num1 = a.charAt(i) - '0';
            } else {
                num1 = a.charAt(i) - '0';
                num2 = b.charAt(j) - '0';
            }
            i -= 1;
            j -= 1;
            int cur = (num1 + num2 + c) & 1;
            c = (num1 + num2 + c) >> 1;
            sb.append(cur);
        }
        if (c != 0) sb.append(c);
        return sb.reverse().toString();
    }
}

