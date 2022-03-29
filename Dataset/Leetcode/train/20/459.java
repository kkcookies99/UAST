 class Solution {
    public boolean XXX(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if ((pop == '(' && c != ')') || (pop == '[' && c != ']') || (pop == '{' && c != '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

