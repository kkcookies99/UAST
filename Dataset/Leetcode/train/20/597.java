 class Solution {
    public boolean XXX(String s) {
        // 栈
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            // 每遇到一个开始符，压一个结束符到栈中
            switch (c){
                case '{' : stack.push('}');break;
                case '(' : stack.push(')');break;
                case '[' : stack.push(']');break;
                default: 
                    // 结束符弹出一个对应的结束符与之比较
                    // 如果空栈或者弹出的结束符不对应
                    // 返回false
                    if(stack.isEmpty() || c!=stack.pop()){
                        return false;
                    }
            }
        }
        // 如果栈被消耗空了，表示开始|结束一一对应.
        return stack.isEmpty();
    }
}

