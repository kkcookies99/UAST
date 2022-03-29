class Solution {
    public int XXX(String s) {
        Map<Character, Integer> r2i = new HashMap<Character, Integer>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        Map<String, Integer> rr2i = new HashMap<String, Integer>(){{
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }};
        int len = s.length();
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (i + 1 < len && rr2i.containsKey(s.substring(i, i + 2))) {
                result = result + rr2i.get(s.substring(i, i + 2));
                i++;
            } else {
                result = result + r2i.get(s.charAt(i));
            }
        }
        return result;
    }
}

