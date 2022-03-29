 class Solution {
    public String XXX(int n) {
        if (n == 1) return "1";
        String pre = XXX(n - 1);
        StringBuffer res = new StringBuffer();
        int cnt = 1;
        for (int i = 1; i < pre.length(); i ++ )
            if (pre.charAt(i) == pre.charAt(i - 1)) cnt ++ ;
            else {
                res.append(cnt).append(pre.charAt(i - 1));
                cnt = 1;
            }
        res.append(cnt).append(pre.charAt(pre.length() - 1));
        return res.toString();
    }
}

