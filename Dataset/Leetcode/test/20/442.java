 class Solution {
    public boolean XXX(String s) {
        if(s.length() % 2 != 0) return false;
        //创建一个栈,然后栈只存放左括号的匹配(也就是右括号)
        Stack<Character> stack = new Stack();
        char[] cha = s.toCharArray();
        for(int i=0;i<cha.length;i++){
            if(cha[i] == '(') stack.push(')');

            else if(cha[i] == '[') stack.push(']');

            else if(cha[i] == '{') stack.push('}');
            
            //如果字符串遍历之后都是右括号,则不会进栈,栈是空的,如果遍历字符串之后,栈是空的,说明整个字符串都是右括号, 或者是当字符串遍历到右括号的时候,就进行出栈,如果出栈的元素和遍历到的右括号不匹配.这两种情况都是返回false
            else if(stack.empty() || cha[i]!=stack.pop()) return false;
        }

        return stack.empty();
    }
}

