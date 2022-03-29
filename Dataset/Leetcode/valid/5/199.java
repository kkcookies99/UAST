 public class Solution {

    public String XXX(String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }

        // 左闭右闭
        int begin = 0, end = 0;
        
        boolean[] dp = new boolean[s.length()];

        for (int r = 1; r < s.length(); r++) {
           // 由于 dp[l] 依赖于 dp[l + 1]，因此新值不会替换旧值， l 仍然按以前的顺序计算
            for (int l = 0; l < r; l++) {
                dp[l] = s.charAt(l) == s.charAt(r) && (r - l < 3 || dp[l + 1]);
                if (dp[l] && (r - l > end - begin)) {
                    begin = l;
                    end = r;
                }
                
            }
        }

        return s.substring(begin, end + 1);
    }
}

