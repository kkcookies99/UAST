 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<chars.length;i++) {
            if(!stack.isEmpty() && match(stack.peek(), chars[i])){
                stack.pop();
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }

    private boolean match(char l, char r) {
        return l == '(' && r == ')'
            || l == '{' && r == '}'
            || l == '[' && r == ']';
    }
}

