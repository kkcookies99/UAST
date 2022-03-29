 class Solution {
    public int XXX(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();
        if (needle.isEmpty()) return 0;
        haystack = " " + haystack;
        needle = " " + needle;

        char[] char1 = haystack.toCharArray();
        char[] char2 = needle.toCharArray();
        int[] next = new int[n2+1];

        // 构建next数组
        for (int i = 2, j = 0; i <= n2; i++) {
            // 匹配失败
            while (j > 0 && char2[j + 1] != char2[i]) {
                j = next[j];
            }
            // 匹配成功
            if (char2[j + 1] == char2[i]) {
                j++;
            }
            next[i] = j;
        }
        // 构建好next数组 开始和主串匹配
        for (int i = 1, j = 0; i <= n1; i++) {
            // 匹配失败
            while (j > 0 && char1[i] != char2[j + 1]) {
                // 找next数组
                j = next[j];
            }
            // 匹配成功
            if (char1[i] == char2[j + 1]) {
                j++;
            }
            if(j == n2){
                return i - j;
            }
        }

        return -1;
    }
}

