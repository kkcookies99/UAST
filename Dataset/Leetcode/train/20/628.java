 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(')
                stack.push(')');
            else if(c=='[')
                stack.push(']');
            else if(c=='{')
                stack.push('}');
            else if(stack.isEmpty() || c!=stack.pop())
                return false;
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}

