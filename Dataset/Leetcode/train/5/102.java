 class Solution {
    public String XXX(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        int beginIdx = 0, len = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            int oddCenterLen = expandAroundCenter(s, i, i);
            int evenCenterLen = expandAroundCenter(s, i, i + 1);
            int curMaxLen = Math.max(oddCenterLen, evenCenterLen);
            if (curMaxLen > len) {
                len = curMaxLen;
                // (curMaxLen + 1)/2 , 求长度一半，如果长度是奇数，取上整
                beginIdx = i - (curMaxLen + 1)/2 + 1;
            }
        }
        return s.substring(beginIdx, beginIdx + len);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return (right - 1) - (left + 1) + 1;
    }
}

