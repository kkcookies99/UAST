 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        if (haystack == null || haystack.length() == 0) return -1;
        //文本串string
        char[] s = haystack.toCharArray();
        //匹配串pattern
        char[] p = needle.toCharArray();
        int m = s.length, n = p.length;
        //构建匹配串的next数组，以便p匹配s过程中p指针的回退
        int[] next = new int[n];
        //初始化next数组，因为是用指针的下一个元素去参与匹配的
        next[0] = -1;
        int res = -1;
        //i：后缀指针，一直往前走不会回退
        //j：前缀指针，匹配不到会回退
        //构建next数组的过程，就相当于两个p字符串进行匹配，
        //只不过一个从下标1开始(文本串)，一个从下标0开始(匹配串)
        for (int i = 1, j = -1; i < n; i++) {
            //处理不匹配的情况，前缀指针j回退
            while (j >= 0 && p[i] != p[j + 1]) j = next[j];
            //匹配的情况，j指针后移，继续匹配下一个字符
            if (p[i] == p[j + 1]) j ++;
            //构建next数组
            next[i] = j; 
        }
        //开始进行匹配，i是文本串指针，j是匹配串指针
        for (int i = 0, j = -1; i < m; i++) {
            //不匹配的情况，j指针回退，文本串指针是永远不会回退的
            while (j >= 0 && s[i] != p[j + 1]) j = next[j];
            //匹配的情况，j指针后移，继续匹配下一个字符
            if (s[i] == p[j + 1]) j ++;
            //匹配完成，保存结果
            if (j == n - 1) {
                res = i - n + 1;
                break;
            }
        }
        return res;
    }
}

