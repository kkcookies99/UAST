class Solution {
    public String XXX(int n) {
        String[] dp = new String[n+1];
        dp[1] = "1";
        //  分割连续的字符串
        for (int k = 2;  k < n + 1; k++) {
            String prev = dp[k-1];
            //  3322251
            //System.out.println(prev);
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int j = i + 1;
            int len = prev.length();
            while (j < len) {
                if (prev.charAt(j) != prev.charAt(i)) {
                    String subs = prev.substring(i,j);
                    sb.append(subs.length());
                    sb.append(subs.charAt(0));
                    i = j;
                }
                j++;
            }
            String subs = prev.substring(i,j);
            sb.append(subs.length());
            sb.append(subs.charAt(0));
            dp[k] = sb.toString();
        }
        return dp[n];
    }
}

