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
        
        int total = 0;
        int pre = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = map.get(s.charAt(i));
            total += (cur >= pre ? cur : -cur);
            pre = cur;
        }
        
        return total;
    }
}

