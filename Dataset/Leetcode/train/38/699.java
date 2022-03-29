 class Solution {
    public String XXX(int n) {
        if (n == 1) {
            return "1";
        }

        char[] old = XXX(n - 1).toCharArray();
        StringBuilder sb = new StringBuilder(50);
        int i = 0, len = old.length;
        while (i < len) {
            int j = i + 1; // 指向与当前字符相同的字符的最远位置
            while (j < len && old[i] == old[j]) {
                j++;
            }
            sb.append("" + (j - i) + old[i]); // 含义"j - i个连续的数字old[i]"
            i = j; // j停留在新的起点
        }
        return sb.toString();
    }
}

