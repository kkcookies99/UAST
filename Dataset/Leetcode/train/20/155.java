 public boolean XXX(String s) {
        if(s.length()==0) return true;
        Stack<Character> stack = new Stack<>();
        stack.push('?');//为了防止栈中元素都弹出去了再执行pop()方法报错。
        for(char c : s.toCharArray()){
            if(c=='(') stack.push(')');
            else if(c=='{') stack.push('}');
            else if(c=='[') stack.push(']');
            else if(c!=stack.pop()) return false;
        }
        return stack.size()==1;
    }

