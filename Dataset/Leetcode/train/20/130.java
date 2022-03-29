     public boolean XXX(String s) {
        Stack<String> stack = new Stack<>();
        if(s != null && !"".equals(s)){
            String [] str = s.split("");

            for(int i = 0; i < str.length; i++){
                if(!stack.empty()){
                    if(")".equals(str[i]) && "(".equals(stack.peek())){
                        stack.pop();
                    }else  if("]".equals(str[i]) && "[".equals(stack.peek())){
                        stack.pop();
                    }else  if("}".equals(str[i]) && "{".equals(stack.peek())){
                        stack.pop();
                    }else{
                        stack.push(str[i]);
                    }
                }else {
                    stack.push(str[i]);
                }
            }
        }
        return stack.empty();
    }

