 public String XXX(int num) {
        String nums = String.valueOf(num);
        String result = "";
        nums = new StringBuffer(nums).reverse().toString();
        for (int i = 0; i < nums.length(); i++) {
            int i1 = Integer.parseInt(nums.substring(i, i + 1));
            if (i == 0) {
                // 个位
                result = digits("I", "V", "X", i1);
            } else if (i == 1) {
                // 十位
                result = digits("X", "L", "C", i1) + result;
            } else if (i == 2) {
                // 百位
                result = digits("C", "D", "M", i1) + result;
            } else if (i == 3) {
                // 千位
                result = loop(i1, "M") + result;
            }
        }
        return result;
    }

    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * <p>
     * 根据不同位数计算一个数字对应的罗马数字（例如个位）
     *
     * @param low  如：I
     * @param mid  如：V
     * @param high 如：X
     * @param num  判断的数字
     * @return 返回罗马数字
     */
    public static String digits(String low, String mid, String high, int num) {
        String result = "";
        if (num == 0) {
            result = "";
        } else if (1 == num) {
            result = low;
        } else if (1 < num && num < 4) {
            result = loop(num, low);
        } else if (num == 4) {
            result = low + mid;
        } else if (num > 4 && num < 9) {
            int lowTimes = num % 5;
            result = mid + loop(lowTimes, low);
        } else if (num == 9) {
            result = low + high;
        }
        return result;
    }

    /**
     * 多个相同字符串拼接
     *
     * @param loopTimes 循环次数
     * @param value     需要循环的值
     */
    public static String loop(int loopTimes, String value) {
        String result = "";
        for (int i = 1; i <= loopTimes; i++) {
            result = result + value;
        }
        return result;
    }

