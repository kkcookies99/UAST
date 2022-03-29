 public int XXX(String s) {
        s = s.trim();
        boolean flag = false;
        StringBuilder builder;
        try {
            if (s == null || s.length() == 0 || (s.length() == 1 && (s.charAt(0) == '+' || s.charAt(0) == '-' || s.charAt(0) == '0'))) {
                return 0;
            }
            int length = s.length();
            if (length == 1) {
                return Integer.valueOf(s.charAt(0)-48);
            } else {
                builder = new StringBuilder();
                char[] chars = s.toCharArray();
                int i = 0;
                char aChar = chars[0];
                flag = aChar == '-' ? true : false;
                if (aChar == '-' || aChar == '+') {
                    i = 1;
                }
                for (int j = i; j < chars.length && chars[j] - 48 >= 0 && chars[j] - 48 <= 9; j++) {
                    builder.append(chars[j]);
                }

            }
            return builder.length() > 0 ? Integer.valueOf(builder.toString())*(flag?-1:1) : 0;
        } catch (Exception e) {
            return (int) (flag ? -2e31 : 2e31 - 1);
        }
    }

