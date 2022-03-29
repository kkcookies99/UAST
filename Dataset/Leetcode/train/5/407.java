 class Solution {
    public String XXX(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        // 遍历选中心
        for (int i = 0; i < s.length(); i++) {
            // 应对奇数个，也就是意味着中心为一个值
            int left = expandAroundCenter(s, i, i);
            // 应对偶数个，也就是意味着中心为两个值
            int right = expandAroundCenter(s, i, i + 1);
            
            int len = Math.max(left, right);
            // 更新最大值，确定做大边界
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }


    public int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }
}



