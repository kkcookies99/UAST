 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        // 先找到最短的字符串
        String s = strs[0];
        for (String str : strs) {
            if (s.length() > str.length()) {
                s = str;
            }
        }

        // 二分查找最短公共前缀的长度
        // 由于前缀长度会使答案呈现：[满足 | 第一个不满足 | 不满足]
        // 因此我们搜索目标是第一个不满足的长度值
        // 用 「 长度 」 对应 「 下标 」 的话需要减 1
        int n = s.length();
        // 左边界为长度 1，对应空字符串（因为 substring 不包括右边界）
        // 右边界为 n + 1，对应最短字符串 s
        int left = 1, right = n + 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (check(strs, s.substring(0, mid))) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return s.substring(0, left - 1);
    }

    private boolean check(String[] strs, String t) {
        for (var s : strs) {
            if (!s.startsWith(t)) {
                return false;
            }
        }
        return true;
    }
}

