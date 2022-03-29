 class Solution {
    public int XXX(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (m == 0) return 0;
        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();

        int[] base = new int[26];
        for (int i = 0; i < m; i++) base[chars2[i] - 'a']++;

        int[] cnt = new int[26];
        for (int i = 0, j = 0; j < n; j++) {
            cnt[chars1[j] - 'a']++;
            while (j - i + 1 > m) cnt[chars1[i++] - 'a']--;
            if (j - i + 1 == m) {
                boolean flag = true;
                for (int k = 0; k < 26 && flag; k++) if (cnt[k] != base[k]) flag = false;
                for (int k = i; k <= j && flag; k++) if (chars1[k] != chars2[k - i]) flag = false;
                if (flag) return i;
            }
        }
        return -1;
    }
}

