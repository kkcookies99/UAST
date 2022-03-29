     public boolean XXX(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            //循环压进左括号
            char e = s.charAt(i);
            if (e == '(' || e == '{' || e == '[') {
                stack.push(e);
            }
            if (e == ')' || e == '}' || e == ']') {
                if(stack.isEmpty()){   //栈空的时候遇到右括号或者剩下的单身狗都是不合法的
                    return false;
                }
                char topE = stack.pop();
                if (topE == '{' && e != '}' || topE == '(' && e != ')' || topE == '[' && e != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

