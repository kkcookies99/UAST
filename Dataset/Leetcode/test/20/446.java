 class Solution {
    public boolean XXX(String s) {
        int length = s.length();
        if (length % 2 != 0){
            return false;
        }
        Deque<Character> stack = new LinkedList<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (int i = 0; i < length; i++){
            if (map.containsKey(s.charAt(i))){
                if (stack.isEmpty() || stack.peek() != map.get(s.charAt(i))){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}

