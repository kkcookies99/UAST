class Solution {
    public int XXX(String s) {
        int sum = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("I", 1);
        hashMap.put("IV", 4);
        hashMap.put("V", 5);
        hashMap.put("IX", 9);
        hashMap.put("X", 10);
        hashMap.put("XL", 40);
        hashMap.put("L", 50);
        hashMap.put("XC", 90);
        hashMap.put("C", 100);
        hashMap.put("CD", 400);
        hashMap.put("D", 500);
        hashMap.put("CM", 900);
        hashMap.put("M", 1000);
        int i;
        for (i = 0; i < s.length() - 1; i++) {
            String s1 = s.substring(i, i + 1);
            if ("I".equals(s1) || "X".equals(s1) || "C".equals(s1)) {
                String s2 = s.substring(i, i + 2);
                 if (hashMap.containsKey(s2)) {
                     sum = sum + hashMap.get(s2);
                     i++;
                     continue;
                 }
            }
            sum = sum + hashMap.get(s1);
        }
        if (i < s.length()) {
            sum = sum + hashMap.get(s.substring(s.length() - 1));

        }
        return sum;
    }
}

