 class Solution {
    public int XXX(String haystack, String needle) {
        char[] str = haystack.toCharArray();
        char[] patt = needle.toCharArray();
        for (int i = 0; patt.length + i - 1 < str.length; i++)
        {
            int j = 0;
            for (; j < patt.length; j++)
            {
                if (str[i + j] != patt[j])
                    break;
            }
            if (j == patt.length)
                return i;
        }
        return -1;
    }
}

