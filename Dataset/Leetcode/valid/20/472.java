 class Solution {
    public boolean XXX(String s) {
   Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (char a : c) {
            /*当字符为括号的左半边时入栈*/
            if (a == '(' || a == '[' || a == '{') {
                stack.push(a);
                /*当字符为括号的右半边时*/
            } else {
                /*如果这时候栈不为空*/
                if (!stack.isEmpty()) {
                    if (a=='}'&&stack.peek()=='{'){
                        stack.pop();
                    }else if (a==']'&&stack.peek()=='['){
                        stack.pop();
                    }else if (a==')'&&stack.peek()=='('){
                        stack.pop();
                        /*如果这时候栈顶元素与当前字符不对称,返回falase*/
                    }else {
                        return false;
                    }
                    /*如果栈为空,说明还没有括号的左半部分在栈中,不对称,返回false*/
                }else {
                    return false;
                }
            }
        }
        /*这是为了应对多余的括号左半部分情况*/
        return stack.isEmpty();
    }
}

