 public String XXX(String s) {
    int center = 0;
    int rightSide = 0;
    int index = 0;
    int radius = 0;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("@");
    for (int i = 0; i < s.length(); i++) {
        stringBuilder.append(s.charAt(i));
        stringBuilder.append("@");
    }
    String newString = stringBuilder.toString();
    int[] ints = new int[newString.length()];
    for (int i = 0; i < ints.length; i++) {
        if (rightSide > i) {
            int left = 2 * center - i;
            ints[i] = ints[left];
            if (ints[left] + i < rightSide) {
                ints[i] = ints[left];
                continue;
            } else {
                ints[i] = rightSide - i;
            }
        }
        while (i - ints[i] - 1 >= 0 && i + ints[i] + 1 < ints.length) {
            if (newString.charAt(i - ints[i] - 1) == newString.charAt(i + ints[i] + 1)) {
                ints[i]++;
            } else {
                break;
            }
        }
        rightSide = i + ints[i];
        center = i;
        if (radius < ints[i]) {
            radius = ints[i];
            index = i;
        }
    }
    StringBuffer sb = new StringBuffer();
    for (int i = index - radius + 1; i <= index + radius; i += 2) {
        sb.append(newString.charAt(i));
    }
    return sb.toString();
}

