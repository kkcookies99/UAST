 class Solution {
    public String XXX(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            // 寻找以s【i】为中心的最长回文子串
            String s1 = palindrome(s, i, i);
            // 应付偶数长的s：以s【i】和s【i+1】为中心的子串
            String s2 = palindrome(s, i, i + 1);

            // pick the longest one
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }

        return res;
    }

    /**
     * 从中心开花找回文，使用l和r主要是应付串长度奇数偶数的情况
     */
    private String palindrome(String s, int l, int r) {
        // prevent out of bound
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        
        // l and r 会被多移动一步
        return s.substring(l+1, r);
    }
}

