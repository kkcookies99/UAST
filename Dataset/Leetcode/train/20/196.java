 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] s1 = s.toCharArray();
        if(s1.length%2==1){
            return false;
        }
        if(s1[0]==')'||s1[0]=='}'||s1[0]==']'){
            return false;
        }else {
            for (char c : s1) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    while(stack.isEmpty()){
                            return false;
                        }
                    if (c == ')') { 
                        if (stack.peek() != '(') {
                            return false;
                        }else{
                            stack.pop();
                        }
                    } else if (c == '}') {
                        if (stack.peek() == '{') {
                            stack.pop();
                        }else{
                            return false;
                        }
                    } else if (c == ']') {
                        if (stack.peek() == '[') {
                            stack.pop();
                        }else{
                            return false;
                        }
                    } else {
                        return stack.isEmpty();
                    }
                    }
                }

        }
        return stack.isEmpty();

    }
}

