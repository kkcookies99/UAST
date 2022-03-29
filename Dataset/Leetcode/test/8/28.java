public static int XXX(String s) {
    s = s.trim();
    if ("".equals(s)) return 0;
    int left = 0;
    boolean isFu = false;
    StringBuilder builder = new StringBuilder();
    int index = 0;
    while (s.charAt(index) == '0') {
        index++;
        if (index == s.length() - 1) return 0;
    }
    s = s.substring(index);
    if (index > 0) {
        if (s.charAt(left) < '0' || s.charAt(left) > '9') return 0;
    }
    if (s.charAt(0) == '-') {
        isFu = true;
        s = s.substring(1);
    } else if (s.charAt(0) == '+') {
        s = s.substring(1);
    }
    while (left < s.length() && (s.charAt(left) >= '0' && s.charAt(left) <= '9')) {
        builder.append(s.charAt(left));
        if (Long.parseLong(builder.toString()) > Integer.MAX_VALUE) {
            if (isFu) return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
        left++;
    }
    if (left == 0) return 0;
    if (isFu) {
        builder.insert(0, "-");
    }
    return Integer.parseInt(builder.toString());
}

