 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        stack.push(chars[0]);
        for(int i=1 ; i < chars.length; i++) {
            if (chars[i] == ')') {
                if (!stack.empty()&&stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }else if(!stack.empty()&&chars[i] == ']'){
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }else if(!stack.empty()&&chars[i] == '}'){
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }else {
                stack.push(chars[i]);
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}

