 class Solution {
    public int XXX(String haystack, String needle) {
        if ("".equals(needle)) return 0;
        
        int[] next = new int[needle.length()];
        getNext(needle, next);
        int i = 0;  //指向文本串
        int j = 0;  //指向模式串
        for (; i < haystack.length(); i++) {
            //出现不匹配的情况，根据next数组回退模式串直到抵达起始位置或者出现匹配字符
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i - needle.length() + 1;
            }
        }
        //没找到
        return -1;
    }
    //生成模式串的next数组
    public void getNext(String s, int[] next) {
        int j = 0;  //前缀末尾
        next[0] = 0;  //初始化next数组
        for (int i = 1; i < s.length(); i++) { //i指后缀末尾
            //前后缀不相等
            while (j > 0 && s.charAt(j) != s.charAt(i)) {
                j = next[j - 1];
            }
            //前后缀相等
            if (s.charAt(j) == s.charAt(i)) {
                j++;
            }
            next[i] = j;  //更新next数组
        }
    }
}

