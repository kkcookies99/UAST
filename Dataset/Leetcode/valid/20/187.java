 class Solution {
    public boolean XXX(String s) {
        char[] Stack = new char[10000]; int top = -1; //定义足够大的栈

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{')Stack[++top] = c; //左括号直接入栈
            else{
                
                if(top <= -1) return false; //此时栈空证明没有左括号就出现了右括号，必不匹配
                          
                //当出现右括号时，栈顶的左括号必须与此右括号种类对应
                switch(c){
                case ')':
                    if(Stack[top] == '(') {top--;break;}else return false;
                case ']':
                    if(Stack[top] == '[') {top--;break;}else return false;
                case '}':
                    if(Stack[top] == '{') {top--;break;}else return false;
                default:
                    break;
                }
            }
        }
        
        //若栈空匹配，返回true
        return top == -1;     
    }
}

