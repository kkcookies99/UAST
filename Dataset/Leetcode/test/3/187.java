 class Solution {
    /**
        执行用时：5 ms, 在所有 Java 提交中击败了81.70%的用户
        内存消耗：38.3 MB, 在所有 Java 提交中击败了88.75%的用户
     */
    public int XXX(String s) {
        int size = s.length();
        if (size < 2) return size;
        int L = 0, R = 1;
        int ans = 1; // 必须以L开头的最长字串
        while (R < size) {
            int index = s.indexOf(s.charAt(R), L);
            // 如果R位置字符不在[L,R]上，则推高R
            if (!(L <= index && index < R)) {
                R++;
            }
            // 如果R位置字符在[L,R]上，则结算L的ans，然后推高L
            else {
                ans = Math.max(ans, R - L);
                L++;
            }
        }
        // 最后可能一直没有结算过L，所以至少要结算一次，比如s=“qa”，导致一直推高R，没有结算过L
        return Math.max(ans, R - L);
    }
}

