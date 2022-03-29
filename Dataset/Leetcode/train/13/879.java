 class Solution {
    public int XXX(String s) {
        int res = 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                String temp = s.substring(i, i + 2);
                if (map.containsKey(temp)) {
                    i++;
                    res += map.get(temp);
                    continue;
                }
            }
            res += map.get(s.charAt(i) + "");
        }

        return res;
    }
}

