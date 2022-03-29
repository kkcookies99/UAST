 public static int XXX(String s) {
    char[] str = s.toCharArray();
    int[] exist = new int[127];
    int i1 = 0;
    int result = 0;
    int i2 = 0;
    for (; i2 < str.length; ++i2) {
        if (exist[str[i2]] >= i1 + 1) {
            result = i2 - i1 > result ? i2 - i1 : result;
            i1 = exist[str[i2]];
        }
        exist[str[i2]] = i2 + 1;
    }
    return i2 - i1 > result ? i2 - i1 : result;
}

