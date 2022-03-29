  public boolean XXX(String s) {
        char[] cs = s.toCharArray();
        Stack stack = new Stack();
        for (int i=0;i<cs.length;i++){
            if (!stack.isEmpty()){
                char c = (char) stack.peek();
                if (c == '{'){
                    if (cs[i] != '}')
                        stack.push(cs[i]);
                    else
                        stack.pop();
                }else if (c == '['){
                    if (cs[i] != ']')
                        stack.push(cs[i]);
                    else
                        stack.pop();
                }else if (c == '('){
                    if (cs[i] != ')')
                        stack.push(cs[i]);
                    else
                        stack.pop();
                }
            }else
                stack.push(cs[i]);
        }
        if (stack.isEmpty())
            return true;
        else return false;
    }

