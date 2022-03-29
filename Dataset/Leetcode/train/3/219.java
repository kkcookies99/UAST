 public static int XXX(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int i = 0, j = 0;
        int maxCount = 1;
        while (i < s.length() - 1 && j < s.length() - 1) {
            String subStr = s.substring(i, j + 1);
            if (!subStr.contains(String.valueOf(s.charAt(j + 1)))) {
                j++;
                int size = j - i + 1;
                maxCount = maxCount > size ? maxCount : size;
            } else {
                i++;
            }
        }
        return maxCount;
}

