 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char ch : chars) {
            if ((ch == '(') || ch == '[' || ch == '{') stack.push(ch);

            if (ch == ')') {
                if (!stack.isEmpty() && (stack.peek() == '(')) stack.pop();
                else return false;
            }

            if (ch == ']') {
                if (!stack.isEmpty() && (stack.peek() == '[')) stack.pop();
                else return false;
            }

            if (ch == '}') {
                if (!stack.isEmpty() && (stack.peek() == '{')) stack.pop();
                else return false;
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}

