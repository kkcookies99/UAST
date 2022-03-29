     public boolean XXX(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            //左边非数字和字母，前进
            while (left < right && !isNumOrLet(s.charAt(left))) left++;
            //右边非数字和字母，后退
            while (left < right && !isNumOrLet(s.charAt(right))) right--;
            //左指针和右指针所指字符不满足条件，直接返回。
            if (!isSame(s.charAt(left), s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean isNumOrLet(char ch) {
        return ch >= '0' && ch <= '9' || ch <= 'z' && ch >= 'a' || ch <= 'Z' && ch >= 'A';
    }

    /*
        1. c1 == c2，true;
        2. c1 != c2, 只有一个为大写字母一个为小写字母时可能为true;
    */
    public boolean isSame(char c1, char c2) {
        if (c1 == c2) return true;
        if (c1 >= 'a' && c1 <= 'z') {
            return c2 + 'a' - 'A' == c1;
        }
        if (c1 >= 'A' && c1 <= 'Z') {
            return c2 + 'A' - 'a' == c1;
        }
        return false;
    }

