 class Solution {
    public boolean XXX(String s) {
        if (s.isEmpty()) return true;
        if ((s.length() & 1) == 1) return false;
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            // '('，')'，'{'，'}'，'['，']' 的 ASCII 码分别是 40、41、91、93、123、125
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (stack.isEmpty() || Math.abs(ch - stack.pop()) > 2) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

