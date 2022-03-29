public boolean XXX(int x) {
    if (x  == 0){return true;}
    if (x < 0 || x%10 == 0){return false;}
    String str = String.valueOf(x);
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
        int a = i;
        int b = chars.length-i-1;
        if (a >= b){break;}
        if (chars[a] != chars[b]){return false;}
    }
    return true;
}
