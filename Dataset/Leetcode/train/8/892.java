 class Solution {
    public int XXX(String str) {
        // 字符串转换为数字，为了使字符串转换更快，现将字符串转为char[]
        char[] chars = str.trim().toCharArray();
        if (chars.length <= 0) {
            return 0;
        }
        int[] val = new int[chars.length];

        char first = chars[0];
        if (first != 45 && first != 43 && (first < 48 || first > 57)) {
            return 0;
        }
        boolean isNegative = false;
        int index = 0;
        if (first == 45) {
            // 表示是负数
            isNegative = true;
            // 第二个字母必须是数字，否则直接退出
            if (chars.length < 2) {
                return 0;
            }

            for (int i = 1; i < chars.length; i++) {
                char c = chars[i];
                if (c < 48 || c > 57) {
                    // 非数字，直接退出
                    break;
                } else {
                    // 表明是数字
                    if (c == 48) {
                        if (index > 0) {
                            val[index++] = c - 48;
                        }
                    } else {
                        val[index++] = c - 48;
                    }
                }
            }
        } else if (first == 43) {
            // 第二个字母必须是数字，否则直接退出
            if (chars.length < 2) {
                return 0;
            }
            for (int i = 1; i < chars.length; i++) {
                char c = chars[i];
                if (c < 48 || c > 57) {
                    // 非数字，直接退出
                    break;
                } else {
                    // 表明是数字
                    if (c == 48) {
                        if (index > 0) {
                            val[index++] = c - 48;
                        }
                    } else {
                        val[index++] = c - 48;
                    }
                }
            }
        } else {
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c < 48 || c > 57) {
                    // 非数字，直接退出
                    break;
                } else {
                    // 表明是数字
                    if (c == 48) {
                        if (index > 0) {
                            val[index++] = c - 48;
                        }
                    } else {
                        val[index++] = c - 48;
                    }
                }
            }
        }

        long realVal = 0L;
        if (isNegative) {
            if (index > 10) {
                return Integer.MIN_VALUE;
            }
            long temp = (long)Math.pow(10, index - 1);
            for (int i = 0; i < index; i++) {
                realVal += temp * val[i];
                temp /= 10;
                if (realVal > Integer.MAX_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
            return (int) realVal * -1;
        } else {

            if (index > 10) {
                return Integer.MAX_VALUE;
            }
            long temp = (long)Math.pow(10, index - 1);
            for (int i = 0; i < index; i++) {
                realVal += temp * val[i];
                temp /= 10;
                if (realVal > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            }
            return (int) realVal;
        }
    }
}

