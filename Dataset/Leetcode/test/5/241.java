 class Solution {
    private int left = 0, right = 0;
    public String XXX(String s) {
        if(s == null || s.trim().length() < 2) {
            return s;
        }
        for(int i = 0; i < s.length(); i++) {
            // 回文中心为奇数的判断
            doLongestPalindrome(s, i, i);
            // 回文中心为偶数的判断
            doLongestPalindrome(s, i, i + 1);
        }
        return s.substring(left, right + 1);
    }
    
    // 由回文中心向两边扩散
    private void doLongestPalindrome(String s, int l, int r) {
        // 循环判断是否为回文
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        // 判断长度是否大于旧值，大于则进行新植替换旧值
        if(r - l - 1 > right - left + 1) {
            // 由于上面一步会使 l 和 r 多走一步，所以这里需要进行值的还原
            left = l + 1;
            right = r - 1;
        }
    }
}

