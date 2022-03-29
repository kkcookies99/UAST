 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;
                char e = stack.pop();
                if(e == '(' && c == ')')
                    continue;
                if(e == '[' && c == ']')
                    continue;
                if(e == '{' && c == '}')
                    continue;
                return false;
            }
        }
        return stack.isEmpty();
    }
}

