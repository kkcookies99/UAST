 class Solution {
    public String XXX(int n) {
        if (n == 1) return "1";
        String preStr = "1";    // 记录上一个字符串
        StringBuilder str = new StringBuilder();    // 用于拼接当前回合的字符串
        for (int i = 2; i <= n; i++) {
            int j = 0, k = 0;   // 双指针找重复数字
            str = new StringBuilder();
            while (k < preStr.length()) {
                while (k < preStr.length() && preStr.charAt(j) == preStr.charAt(k)) k++;
                int num = k - j;
                str.append(num).append(preStr.substring(j, j+1));
                j = k;
            }
            preStr = str.toString();
        }
        return str.toString();
    }
}

