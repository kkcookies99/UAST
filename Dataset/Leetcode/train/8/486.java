 class Solution {
    // 直接遍历 处理边界 
    public int XXX(String s) {
        char[] chars = s.toCharArray();

       int i = 0, base = 0;
        // 1. 丢弃前导空格
        while (i < s.length() && chars[i] == ' ') i++;
        if (i == s.length()) return 0;

        // 2. 检查 + 和 - 是否存在
        int sign = chars[i] == '-' ? -1 : 1;
        i = (chars[i] == '-' || chars[i] == '+') ? i + 1 : i;

        // 3. 计算结果，并且检查是否溢出
        while (i < chars.length && chars[i] >= '0' && chars[i] <= '9') { // 字符必须在0-9范围内
            int number = chars[i] - '0';
            // 提前检查是否会溢出，否则后面乘以10可能已经溢出了 整数范围：[-2147483648, 2147483647]
            int _10_max = Integer.MAX_VALUE / 10; // 214748364
            if (sign > 0 && (base > _10_max || base == _10_max && number > 7)) return Integer.MAX_VALUE;
            if (sign < 0 && (base > _10_max || base == _10_max && number > 8)) return Integer.MIN_VALUE;
            base = base * 10 + number;
            i++;
        }

        return sign * base;
    }
}

