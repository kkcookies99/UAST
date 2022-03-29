public String XXX1(String s) {
    s.charAt(0);
    if (s == null || s.length() == 0) return "";
    char[] chars = s.toCharArray();
    int start = 0;
    int len = 0;

    /**
     *  i 从头向尾遍历（并保证检测长度大于当前回文串长度）
     *  j 从尾向头遍历（同上，并确保检测长度大于当前回文串长度）
     *  len 表示当前最长回文串长度
     *  start 记录当前最长回文串起始索引
     */
    for (int i = 0; i < chars.length - len; i++) {
        for (int j = chars.length - 1; j > i + len; j--) {
            int left = i;
            int right = j;
            //检测是否为回文串
            while (left < right) {
                if (chars[left] != chars[right]) break;
                else {
                    left++;
                    right--;
                }
            }
            if (left >= right) {
                start = i;
                len = j - i;
            }
        }
    }
    return String.valueOf(Arrays.copyOfRange(chars, start, start + len + 1));
}
