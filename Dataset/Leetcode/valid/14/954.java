 public String XXX(String[] strs) {
        // 题目有假设，不做校验
        int minLength = Integer.MAX_VALUE;
        String minLengthString = "";
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
                minLengthString = str;
            }
        }
        for (int i = 0; i < minLength; i++) {
            char c = minLengthString.charAt(i);
            if (!checkStrs(c, i, strs)) {
                return minLengthString.substring(0, i);
            }
        }
        return minLengthString;
    }

    /**
     * 判断数组中所有字符串对应位置是否是相同字符
     */
    private boolean checkStrs(char c, int i, String[] strs) {
        for (String str : strs) {
            if (i >= str.length() || c != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

