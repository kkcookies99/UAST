 class Solution {
    public int XXX(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>() {{
            put("I", 1);
            put("IV", 4);
            put("V", 5);
            put("IX", 9);
            put("X", 10);
            put("XL", 40);
            put("L", 50);
            put("XC", 90);
            put("C", 100);
            put("CD", 400);
            put("D", 500);
            put("CM", 900);
            put("M", 1000);
        }};
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String str = "" + chars[i];
            if (i != chars.length - 1) {
                if (map.containsKey(str + chars[i + 1])) {
                    sum += map.get(str + chars[i + 1]);
                    i++;
                } else {
                    sum += map.get(str);
                }
            } else {
                sum += map.get(str);
            }
        }
        return sum;
    }
}

