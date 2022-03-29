 class Solution {
    public int XXX(String str) {
         if (str == null || str.length() == 0) {
            return 0;
        }
        boolean isPositive = true;
        char[] chars = str.toCharArray();
        int index = 0;
        boolean isFound = false;
        for (int i = 0; i < chars.length; i++) {
            if (((int) chars[i]) >= 48 && ((int) chars[i]) <= 57) {
                break;
            }
            if (chars[i] == '-') {
                isPositive = false;
                index = i;
                isFound = true;
                break;
            } else if (chars[i] == '+') {
                isPositive = true;
                index = i;
                isFound = true;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        int lastIndex = isFound ? index + 1 : 0;
        for (int j = lastIndex; j < chars.length; j++) {
            if (chars[j] == ' ') {
                if (sb.length() > 0) {
                    break;
                }
                if (isFound) {
                    break;
                } else {
                    continue;
                }
            }
            if (((int) chars[j]) >= 48 && ((int) chars[j]) <= 57) {
                sb.append(chars[j]);
            } else {
                break;
            }
        }
        if (sb.length() > 0) {
            try {
                String s = sb.toString();
                while (s.startsWith("0")) {
                    s = s.substring(1, s.length());
                }
                if (s.length() > 11) {
                    return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                Long longVal = Long.parseLong(s);
                if (isPositive) {
                    longVal = longVal > Integer.MAX_VALUE ? Integer.MAX_VALUE : longVal;
                } else {
                    longVal = -longVal;
                    longVal = longVal < Integer.MIN_VALUE ? Integer.MIN_VALUE : longVal;
                }
                return longVal.intValue();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return 0;
    }
}

