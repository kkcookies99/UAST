class Solution {
    public int XXX(String s) {
        HashMap<Character, Integer> map = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += map.get(s.charAt(i));
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                res -= map.get(s.charAt(i - 1)) * 2;
            }
        }
        return res;
    }
}

