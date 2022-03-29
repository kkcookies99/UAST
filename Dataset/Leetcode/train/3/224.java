public static int XXXOn(String s) {
    if (null == s)
        return 0;
    int max = 0;
    for (int i = 0, j = i; i < s.length() && j < s.length(); ) {

        int sum = j - i + 1;
        for (j += 1; j < s.length(); ++j) {
            int index = s.substring(i, j).indexOf(s.substring(j, j + 1));

            if (index >= 0) {
                i += index + 1;
                break;
            }

            sum++;
        }

        max = Math.max(max, sum);
    }
    return max;
}
