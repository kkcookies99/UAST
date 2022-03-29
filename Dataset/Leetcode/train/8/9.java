class Solution {
    public int XXX(String s) {
        if (s == null || s.length() ==0) {
            return 0;
        }
        char[] chars = s.trim().toCharArray();
        // 数字的开始
        int begin = -1;
        // 是否为正数
        boolean isPositive = true;
        if (chars.length > 0) {
            if (chars[0] == '-'){
                isPositive = false;
                begin = 1;
            } else if (chars[0] == '+') {
                isPositive = true;
                begin = 1;
            } else if (chars[0] >= '0' && chars[0] <= '9') {
                begin = 0;
                isPositive = true;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = begin; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                sb.append(chars[i]);
            } else {
                break;
            }
        }
        String str = sb.toString();
        if (Objects.equals(str, "")) {
            return 0;
        }
        Long aLong = null;
        try {
            aLong = Long.parseLong(str);
        } catch (Exception e) {
            if (isPositive) {
                return Integer.MAX_VALUE;
            } else return Integer.MIN_VALUE;
            
        }
        // 正数
        if (isPositive) {
            return aLong > Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.toIntExact(aLong);
        } else { // 负数
            return -aLong < Integer.MIN_VALUE ? Integer.MIN_VALUE : Math.toIntExact(-aLong);
        }
    }
}


