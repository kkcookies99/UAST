class Solution {
    public int XXX(String s) {
        if (s.length() == 0) return 0;
        char[] nums = s.toCharArray();
        int k = 0;
        while (k < s.length() && nums[k] == ' ') k ++ ;
        if (k == s.length()) return 0;
        boolean isMinus = false;
        if (nums[k] == '-') {
            isMinus = true;
            k ++ ;
        } else if (nums[k] == '+') k ++ ;
        int res = 0;
        while (k < s.length() && nums[k] >= '0' && nums[k] <= '9') {
            int t = nums[k] - '0';
            if (isMinus && res * -1 < (Integer.MIN_VALUE + t) / 10) {
                return Integer.MIN_VALUE;
            }
            else if (!isMinus && res > (Integer.MAX_VALUE - t) / 10) {
                return Integer.MAX_VALUE;
            }
            res = res * 10 + t;
            k ++ ;
        }
        if (isMinus) return res * -1;
        return res;
    }
}

