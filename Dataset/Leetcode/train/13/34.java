class Solution {
    public int XXX(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int res = 0;
        for(int i = 0; i < s.length(); i ++) {
            int curVal = map.get(s.charAt(i));
            int nextVal = i < s.length() - 1 ? map.get(s.charAt(i + 1)) : 0;
            res += curVal < nextVal ? - curVal : curVal;
        }
        
        return res;
    }
}

