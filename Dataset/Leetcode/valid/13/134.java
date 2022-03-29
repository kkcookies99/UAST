class Solution {
    public int XXX(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int res = 0, mark = 9999;
        for(int i = 0; i < s.length(); i++) {
            int n = m.get(s.charAt(i));
            if (n > mark) {
                res += n - 2 * mark;
            } else {
                res += n;
            }
            mark = n;
        }
        
        return res;
    }
}

