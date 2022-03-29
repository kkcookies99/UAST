 class Solution {
    public boolean XXX(String s) {
        byte[] s_byte = s.getBytes(); //字符串转化为byte数组，即对应字符的ASCII码表。
        Stack<Byte> stack = new Stack<>();  //创建栈。（消消乐的场地）
        byte symbol = 0;  //消消乐目标
        if(s.length() % 2 != 0){
            return false;  //奇数个字符直接返回false。
        }else{
            for(int i = 0; i < s.length(); i++){
                if(s_byte[i] == 40 || s_byte[i] == 91 || s_byte[i] == 123){  //下一个字符为（、{、[之一时，压栈。
                    stack.push(s_byte[i]); // 被消除者为（、{、[ ，将这些字符压入栈中。
                    symbol = s_byte[i];  //修改消消乐目标为当前最新压入的被消除者。
                }else if(s_byte[i] == (symbol + 1) || s_byte[i] == (symbol + 2)){  //下一个字符为 ）、}、]之一时，弹栈。
                    stack.pop(); 
                    symbol = stack.empty() ? 0 : stack.peek();  //消消乐成功，更换新的消消乐目标。
                }else{
                    return false;
                }
            }        
        }
        while(stack.empty()){  //结束且栈中无剩余。
            return true;
        }
        return false;   //栈中有剩余。
    }
}

