class Solution {
    public String XXX(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int n = a.length(), m = b.length();
        char[] ac = reverse(a.toCharArray()), bc = reverse(b.toCharArray());
        int t = 0;
        for (int i = 0; i < Math.max(n, m); i++) {
            if (i < n) t += ac[i] - '0';
            if (i < m) t += bc[i] - '0';
            sb.append(t % 2);
            t /= 2;
        }
        if (t > 0) sb.append(t);
        sb.reverse();
        return sb.toString();
    }
    char[] reverse(char[] cs) {
        int n = cs.length;
        char[] ans = new char[n];
        for (int i = 0; i < n; i++) {
            ans[i] = cs[n - 1 - i];
        }
        return ans;
    }
}

