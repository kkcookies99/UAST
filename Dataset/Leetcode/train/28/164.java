 class Solution {
    public int XXX(String haystack, String needle) {
        if ("".equals(needle)) return 0;
        
        int[] next = new int[needle.length()];
        getNext(needle, next);
        int i = 0;  //指向文本串
        int j = 0;  //指向模式串
        while (i < haystack.length()) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                ++i;
                ++j;
            } else {
                j = next[j];
            }
            //找到匹配的字符串
            if (j == needle.length()) {
                return i - needle.length();  //返回needle在haystack中出现的第一个位置
            }
        }
        //没找到
        return -1;
    }
    //生成模式串的next数组
    public void getNext(String s, int[] next) {
        int k = -1;  //前缀的终点
        int j = 0;  //后缀的终点
        next[0] = -1;
        while (j < s.length() - 1) {
            if (k == -1 || s.charAt(k) == s.charAt(j)) {
                ++k;
                ++j;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
    }
}

