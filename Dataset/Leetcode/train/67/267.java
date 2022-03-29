     public String XXX(String a, String b) {
        int m = a.length(), n = b.length();
        int k = Math.max(m, n);
        int ret = 0;
        String ans = "";
        for (int i = 1; i <= k; i++){
            char ca = i <= m ? a.charAt(m - i) : '0';
            char cb = i <= n ? b.charAt(n - i) : '0';
            int t = ca - '0' + cb - '0' + ret;
            ret = t >= 2 ? 1 : 0;
            ans = (t & 1) + ans;
        }
        return ret > 0 ? 1 + ans : ans;
    }

