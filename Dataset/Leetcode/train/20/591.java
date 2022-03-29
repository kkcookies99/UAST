 class Solution {
    public boolean XXX(String s) {
        //建立一个栈
        Stack<Character> stk = new Stack();

        //是左括号就入栈
        for (Character c : s.toCharArray())
            if (c == '(' || c == '[' || c == '{'){
                stk.push(c);
            }

            //现在判断右括号
            //peek（） 功能是返回栈顶元素
            else if (c == ')' && !stk.empty() && stk.peek() == '(' ){
                stk.pop();//当场出栈
            }
            else if (c == ']' && !stk.empty() && stk.peek() == '['){
                stk.pop();
            }
            else if (c == '}' && !stk.empty() && stk.peek() == '{'){
                stk.pop();
            }
            else{
                return false;
            }
        return stk.empty();//空回true 不空就是false



        
    }
}

