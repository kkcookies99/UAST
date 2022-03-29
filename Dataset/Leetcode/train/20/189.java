 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char foo = s.charAt(i);
            switch(foo) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    try {
                        if(foo != stack.pop()) {
                            return false;
                        }
                    } catch (Exception e) {
                        return false;
                    }
            }
        }
        
        if(stack.empty()) {
            return true;
        } else {
            return false;
        }        
    }
}

