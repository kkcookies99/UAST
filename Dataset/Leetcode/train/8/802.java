 class Solution {
    public int XXX(String str) {
         return XXX(str, "");
    }
    
    public static int XXX(String str, String prefix) {
        if (str.startsWith(" ")) {
               if (prefix.isEmpty()) {
                return XXX(str.substring(1), prefix);
            } else {
                return XXX("", prefix);
            }
        } else if ((str.startsWith("+") || str.startsWith("-") ) && prefix.isEmpty()) {
            return XXX(str.substring(1), prefix.concat(str.substring(0, 1)));
        } else if (!str.isEmpty() && isNum(str.charAt(0))) {
            return XXX(str.substring(1), prefix.concat(str.substring(0, 1)));
        } else {
            if (prefix.isEmpty()) {
                return 0;
            } else {
                try {
                   double res = Double.valueOf(prefix);
                    if (res > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    } else if (res < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    } else {
                        return (int)res;
                    }
                } catch (NumberFormatException e) {
                    return 0;
                }
            }
        }
    }

    public static boolean isNum(char c) {
        return c >= 48 && c <= 57;
    }
}

