 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.empty() && ((ch == ')' && stack.peek() == '(') || (ch == ']' && stack.peek() == '[') || (ch == '}' && stack.peek() == '{') )) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.empty();
    }

}

