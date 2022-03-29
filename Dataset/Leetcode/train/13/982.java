 public int XXX(String s) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put((int) 'M', 1000);
    map.put((int) 'D', 500);
    map.put((int) 'C', 100);
    map.put((int) 'L', 50);
    map.put((int) 'X', 10);
    map.put((int) 'V', 5);
    map.put((int) 'I', 1);
    char[] chars = s.toCharArray();
    int result = 0;
    for (int i = 0; i < chars.length - 1; i++) {
        int value0 = map.get((int) chars[i]);
        int value1 = map.get((int) chars[i + 1]);
        if (value0 < value1) {
            value0 = -value0;
        }
        result = result + value0;

    }
    result = result + map.get((int) chars[chars.length - 1]);
    return result;
}
