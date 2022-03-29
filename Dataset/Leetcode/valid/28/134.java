 class Solution {
    public int XXX(String haystack, String needle) {
        if (haystack == null || needle == null || needle.length() == 0) {
            return 0;
        }
        int m = haystack.length(), n = needle.length();
        int i = 0, j = 0;
        while (i < m && j < n) { 
            if (haystack.charAt(i) == needle.charAt(j)) { //逐个比较，相等，则继续往后比
                ++i;
                ++j;
            } else { //不相等，则指针回溯
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == n) { //字串比完了，返回位置
            return i - j;
        } else {
            return -1;
        }
    }
}

