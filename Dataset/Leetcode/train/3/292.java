public static int XXX(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int max = 0;
    char c;
    for (int i = 0; i < s.length(); i++) {
        c = s.charAt(i);
        if (map.containsKey(c)) {
            i = map.get(c); // 出现重复，则从重复字符串的下1位继续开始遍历
            max = Math.max(map.size(), max);
            map.clear();
            continue;
        }
        map.put(c, i);
    }
    return Math.max(max, map.size());
}
