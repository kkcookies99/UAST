class Solution {
    public String XXX(String a, String b) {
        int t = 0;
        String res = "";
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            if (i >= 0) t += (a.charAt(i) - '0');
            if (j >= 0) t += (b.charAt(j) - '0');
            res = (t % 2) + res;
            t /= 2;
        }
        return (t > 0 ? t : "") + res;
    }
}

