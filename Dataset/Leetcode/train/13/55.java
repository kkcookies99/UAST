class Solution {
    public int XXX(String s) {
        Map<Character, Integer> romans = new LinkedHashMap<>();
        int res = 0;
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // 最后一个直接加上
            if (i == chars.length - 1)
                return res += romans.get(chars[i]);
            res += romans.get(chars[i]) >= romans.get(chars[i + 1]) ?
                    romans.get(chars[i]) : -romans.get(chars[i]);
        }
        return res;
    }
}

