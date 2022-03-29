 class Solution {
    public boolean XXX(String s) {
        char start = s.charAt(0);
        if (start == '}' || start == ')' || start == ']')
        {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c){
                case '(' : stack.push('(');
                break;
                case '[' : stack.push('[');
                break;
                case '{' : stack.push('{');
                break;
                case ')' :
                    if (stack.size() > 0 && stack.peek() == '('){
                        stack.pop();
                        break;
                    }
                    else{
                        return false;
                    }

                case ']' :
                    if (stack.size() > 0 && stack.peek() =='['){
                        stack.pop();
                        break;
                    }
                    else{
                        return false;
                    }
                   // break;
                case '}' :
                    if (stack.size() > 0 && stack.peek() =='{'){
                        stack.pop();
                        break;
                    }
                    else{
                        return false;
                    }

            }
        }
        return stack.isEmpty();
    }
}

