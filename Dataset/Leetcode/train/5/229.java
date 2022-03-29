 class Solution {
    public String XXX(String s) {
        // Manacher
        // 参考 https://segmentfault.com/a/1190000003914228
        if (s == null) {
            return "";
        }
        if (s.length() < 2) {
            return s;
        }
        // 统一奇偶两种情况的操作
        String marked = s.replaceAll("(.)", "#$1") + "#";// 每个字符前后都加上标记
        int maxCenter = 0, maxLength = 0; // 最长回文串的中心和半径
        int[] p = new int[marked.length()]; // 标记，表示以这一位置为中心最长回文串的半径
        int center = 0, right = 0;
        for (int i = 0; i < marked.length(); i++) {
            p[i] = i < right ? Math.min(p[center * 2 - i], right - i) : 1;// 精髓所在，具体看文章
            // 扩展，注意边界
            while (i - p[i] > -1 && i + p[i] < marked.length() && marked.charAt(i - p[i]) == marked.charAt(i + p[i])) {
                p[i]++;
            }
            if (p[i] + i - 1 > right) {
                right = p[i] + i - 1;
                center = i;
            }
            // 更新最长回文串的长度
            if (p[i] > maxLength) {
                maxCenter = i;
                maxLength = p[i];
            }
        }
        return marked.substring(maxCenter - maxLength + 1, maxCenter + maxLength).replaceAll("#", "");
    }
}

