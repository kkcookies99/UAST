  class Solution {
    public boolean XXX(String s) {
        if(s.length() == 1) return (false);
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.isEmpty()||c == '('||c == '{'||c == '['){
               stack.push(c);
            }else {
                if(stack.peek() == '('&&c == ')'||stack.peek() =='{'&&c == '}'||
                        stack.peek() == '['&&c ==']'){
                    stack.pop();
                }else return false;
            }
        }
        return stack.isEmpty();
    }
}

