 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            // 判断剩余的字符长度是不是比要找的字符长度小，小了证明肯定是不包含
            if (haystack.length() - i < needle.length()) {
                break;
            }
            // 如果字符不一样，往后找
            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            }
            // 截取字符
            String s = haystack.substring(i, i + needle.length());
            if (s.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}

