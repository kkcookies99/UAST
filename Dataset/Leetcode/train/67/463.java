class Solution {
    public String XXX(String a, String b) {
        StringBuilder res = new StringBuilder();
        for (int i = a.length() - 1, j = b.length() - 1, t = 0; i >= 0 || j >= 0 || t > 0; i --, j -- ) {
            if (i >= 0) t += (a.charAt(i) - '0');
            if (j >= 0) t += (b.charAt(j) - '0');
            res.insert(0, t % 2);
            t >>= 1;
        }
        return res.toString();
    }
}

