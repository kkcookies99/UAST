 class Solution {
    public boolean XXX(String s) {
        if (s == null || s.equals("")) return true;
        Map<Character, Character> map = new HashMap<>();
        
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) stack.push(s.charAt(i));
            else {
                if (!stack.isEmpty() && map.get(s.charAt(i)) == stack.peek()) stack.pop();
                else stack.push(s.charAt(i));
            }
        }
        
        if (stack.isEmpty()) return true;
        return false;
    }
}

