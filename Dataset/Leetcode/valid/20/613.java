 class Solution {
    public boolean XXX(String s) {
        Stack<Character> left = new Stack();
        Stack<Character> right = new Stack();
        for(int i = 0; i < s.length(); i++) {
            left.push(s.charAt(i));
        }
        while(!left.isEmpty()) {
            char c = left.pop();
            if(!right.isEmpty() ) {
                if((c == '(' && right.peek() == ')') || (c == '{' && right.peek() == '}') || (c == '[' && right.peek() == ']'))
                    right.pop();
                else right.push(c);
            } else {
                right.push(c);
            }
        }
        return right.isEmpty();
    }
}

