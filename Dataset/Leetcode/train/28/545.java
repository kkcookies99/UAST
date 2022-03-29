 class Solution {
    public int XXX(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        if(n == 0) return 0;
        char[] text = haystack.toCharArray(); 
        char[] pattern = needle.toCharArray();
        return kmp_search(text, pattern);
        
    }
    //kmp
    public int kmp_search(char[] text, char[] pattern) {
        int m = text.length;
        int n = pattern.length;
        int[] prefix = new int[n];
        prefix_table(pattern, prefix, n);
        int i = 0, j = 0;
        while (i < m) {
            if(j == n - 1 && text[i] == pattern[j]) return i - j;
            if (text[i] == pattern[j]) {
                i++;
                j++;
            }
            else {
                j = prefix[j];
                if (j == -1) {
                    i++;
                    j++;
                }
            }
        }
        return -1;
    }

    //构建模式串的最长公共前后缀表
    public void prefix_table(char[] pattern, int[] prefix, int n) {
        prefix[0] = 0;
        int len = 0;
        int i = 1;
        while (i < n) {
            if (pattern[i] == pattern[len]) {
                len++;
                prefix[i++] = len;
            }
            else {
                if (len > 0) len = prefix[len - 1];
                else prefix[i++] = 0;
            }
        }

        //预处理prefix_table
        for (int j = n - 1; j >= 1; j--) prefix[j] = prefix[j - 1];
        prefix[0] = -1;
    }
}

