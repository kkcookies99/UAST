 class Solution {
    public String XXX(String[] strs) {
        StringBuilder sb = new StringBuilder();
        // 找到长度最短的字符串
        int minLength = strs[0].length();
        for (String s : strs) {
            if (minLength > s.length()) {
                minLength = s.length();
            }
        }
        // 第一个字符串的数组
        char[] firStrChar = strs[0].toCharArray();
        // 按照最小长度遍历
        for (int i = 0; i < minLength; i++) {
            // 跳出循环的标识符
            boolean f = false;
            // 按照字符串数组个数遍历
            for (int j = 1; j < strs.length; j++) {
                // 每一个
                char[] strItem = strs[j].toCharArray();
                if (firStrChar[i] != strItem[i]) {
                    f = true;
                    break;
                }
            }
            if (f) {
                return sb.toString();
            }
            sb.append(firStrChar[i]);
        }
        return sb.toString();
    }
}

