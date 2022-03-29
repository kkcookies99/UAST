 class Solution {
    public int XXX(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put(' ', 0);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        char prevCh = ' ';
        
        int ans = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currCh = s.charAt(i);
            int curr = map.get(currCh);
            if (map.get(prevCh) > curr) {
                ans -= curr;
            } else {
                ans += curr;
            }
            prevCh = currCh;
        }
        
        return ans;
    }
}

