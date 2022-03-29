 class Solution {
    public String XXX(int n) {
        if (n == 1) return "1";
        
        String pre = XXX(n - 1);
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (int i = 1; i < pre.length(); i ++ ) {
            if (pre.charAt(i) == pre.charAt(i - 1)) cnt ++ ;
            else {
                sb.append(cnt).append(pre.charAt(i - 1));
                cnt = 1;
            }
        }
        sb.append(cnt).append(pre.charAt(pre.length() - 1));
        return sb.toString();
    }
}

