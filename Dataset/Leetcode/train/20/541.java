 class Solution {
    public boolean XXX(String s) {
        Stack<Character> ss = new Stack<Character>();
        for(char c: s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[')
                ss.push(c); 

            if(c == ')') {
                if(ss.isEmpty() || ss.pop() != '(')
                return false;
            }
            else if(c == '}') {
                if(ss.isEmpty() || ss.pop() != '{')
                return false;
            }
            else if(c == ']') { 
                if(ss.isEmpty() || ss.pop() != '[')
                return false;
            }
        }
        return ss.isEmpty();
    }
}

