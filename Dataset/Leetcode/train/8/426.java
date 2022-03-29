 class Solution {
    public int XXX(String s) {
        int first = 0, end, len = s.length();
        int flag = 0;
        char ch;
        // 获取符号并消除前导
        while (first < len) {
            ch = s.charAt(first);
            if (ch == '-') {
                if ((flag & 7) != 0) {
                    return 0;
                }
                flag |= 1;
            } else if (ch == '+') {
                if ((flag & 7) != 0) {
                    return 0;
                }
                flag |= 2;
            } else if (ch == '0') {
                flag |= 4;
            } else if (ch == ' ') {
                if ((flag & 7) != 0) {
                    return 0;
                }
                flag |= 8;
            } else if (ch >= '1' && ch <= '9') {
                break;
            } else {
                return 0;
            }
            ++first;
        }
        // 判断是否空数
        if (first == len) {
            return 0;
        }
        // 确定数字结束位
        end = first + 1;
        while (end < len) {
            ch = s.charAt(end);
            if (ch < '0' || ch > '9') {
                break;
            }
            ++end;
        }
        if (end - first > 10) {
            return (flag & 1) == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        // 转换数字并确定符
        long ret = 0, unit = doUnit(end - first);
        while (first < end) {
            ret = ret + (s.charAt(first) - '0') * unit;
            unit /= 10;
            ++first;
        }
        if ((flag & 1) == 1) ret = -ret;
        if (ret < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (ret > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) ret;
    }

    private long doUnit(int ex) {
        long unit = 1;
        while (ex > 1) {
            unit *= 10;
            --ex;
        }
        return unit;
    }

}

