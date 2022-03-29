 class Solution {
    public String XXX(int n) {
        String ans = "1";
        while (n > 1) {
            StringBuilder sb = new StringBuilder();
            int left = 0;
            int len = ans.length();
            for (int i = 0; i < len; i++) {
                left++;
                boolean condi = i+1 < len && ans.charAt(i) != ans.charAt(i+1);
                if (condi || i == len - 1) {
                    sb.append(left).append(ans.charAt(i));
                    left = 0;
                }
            }
            ans = sb.toString();
            n--;
        }
        return ans;
    }
}

