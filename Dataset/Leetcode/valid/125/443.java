 public boolean XXX(String s) {
        String str = s.toLowerCase().trim();
        if ("".equals(str) || str == null) {
            return true;
        }
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        int start = 0;
        int end = str.length() - 1;
        char[] chars = str.toCharArray();
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

