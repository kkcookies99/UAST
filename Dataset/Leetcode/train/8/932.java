 class Solution {
    public int XXX(String str) {
//        取巧用long类型来减少判断
//        i为当前字符位置，用flag表示正负
        long ans = 0;
        int i = 0, flag = 1;
//        转换为char数组似乎可以加快速度
        char[] s = str.toCharArray();
//        去掉前置空格
        while (i < s.length) {
            if (s[i] != ' ') {
                break;
            }
            i++;
        }
//        防止越界
        if (i == s.length) {
            return 0;
        }
//        判断正负
        if (s[i] == '-') {
            flag = -1;
            i++;
        } else if (s[i] == '+') {
            i++;
        }
//        字符串转换为数字
        for (; i < s.length; i++) {
            int x = s[i] - '0';
            if (x >= 0 && x <= 9) {
                ans = ans * 10 + x;
            } else {
                break;
            }
//        超过界限后退出，减少计算量
//        考虑ans是2^31的情况，之后再改变ans的值
            if (ans > Integer.MAX_VALUE) {
                break;
            }
        }
//        得到ans的正确值
        ans *= flag;
        if (ans < Integer.MIN_VALUE) {
            ans = Integer.MIN_VALUE;
        } else if (ans > Integer.MAX_VALUE) {
            ans = Integer.MAX_VALUE;
        }
        return (int) ans;
    }
}

