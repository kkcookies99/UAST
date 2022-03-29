 class Solution {
    public int XXX(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        char[] chars = s.toCharArray();
        Integer integer = 0;
        for (int i = 0; i < chars.length; i++) {
            String zf = String.valueOf(chars[i]);
            if (chars[i] == 'I') {
                if (i + 1 < chars.length && (chars[i + 1] == 'V' || chars[i + 1] == 'X')) {
                    integer -= map.get(zf);
                } else {
                    integer += map.get(zf);
                }
            } else if (chars[i] == 'X') {
                if (i + 1 < chars.length && (chars[i + 1] == 'L' || chars[i + 1] == 'C')) {
                    integer -= map.get(zf);
                } else {
                    integer += map.get(zf);
                }
            } else if (chars[i] == 'C') {
                if (i + 1 < chars.length && (chars[i + 1] == 'D' || chars[i + 1] == 'M')) {
                    integer -= map.get(zf);
                } else {
                    integer += map.get(zf);
                }
            } else {
                integer += map.get(zf);
            }
        }
        return integer;
    }
}

