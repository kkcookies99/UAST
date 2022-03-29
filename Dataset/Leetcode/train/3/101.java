 class Solution {
    public int XXX(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int ans = 0;
        int[] map = new int[128];

        for (int i = 0, j = 0; i < s.length(); i++) {
            // 将 i 所指字符出现的次数加 1
            map[s.charAt(i)]++;
            while (map[s.charAt(i)] > 1) {
                // 注意：需要将 j 所指字符出现的次数减 1
                map[s.charAt(j)]--;
                j++;
            }
            // 不断更新结果，取最大的值
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}

