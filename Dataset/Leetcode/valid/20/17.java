 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            //遇到左括号，将相应的右括号入栈
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            //遇到右括号且匹配
            else if (!stack.isEmpty() && stack.peek() == c) stack.pop();
            //出现右括号多余或者右括号不匹配
            else return false;
        }
        //如果字符串遍历结束，栈中仍有字符，说明有左括号多余
        //否则反之
        return stack.isEmpty();
    }
}

