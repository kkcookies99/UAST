 class Solution {
    public boolean XXX(String s) {
        if(s.length()==0) return true;
        Stack<Character> stack=new Stack<Character>(); //辅助栈
        for(char c:s.toCharArray()){
            if(c=='{') stack.push('}');  //如果是左符号，往栈中放入右符号
           else if(c=='[') stack.push(']');
           else if(c=='(') stack.push(')');
            //不是左边符号的情况，就是右边符号或者没有符号输入的情况；

            //如果栈中为空，也就是只有左边符号的情况；c!=pop()也就是左右不匹配。
            else if (stack.isEmpty()||c!=stack.pop()) 
            return false;
        }
        return stack.isEmpty();
    }
}

