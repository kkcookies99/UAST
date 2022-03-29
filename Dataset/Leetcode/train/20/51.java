 class Solution {
    public boolean XXX(String s) {
        //字符串为空
        if (s == null || s.length() == 0) {
            return false;
        }
        //字符串为奇数
        if (s.length() % 2 == 1) {
            return false;
        }
        //主逻辑
        Stack<Character> stk=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stk.push(c);
            }else if(c==')'){
                if(stk.empty() || stk.peek()!='('){
                     return false;
                }
                stk.pop();
            }else if(c=='}'){
                if(stk.empty() || stk.peek()!='{'){
                    return false;
                }
                stk.pop();
            }else if(c==']'){
                if(stk.empty() || stk.peek()!='['){
                    return false;
                }
                stk.pop();
            }else {
                return false;
            }
        }
        return stk.empty();
    }
}

