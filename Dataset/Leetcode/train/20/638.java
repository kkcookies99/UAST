     public boolean XXX(String s) {
        if(s.length() == 0)
            return true;

        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(stack.peek() == '(' && s.charAt(i) == ')'){
                stack.pop();
            }else if(stack.peek() == '[' && s.charAt(i) == ']'){
                stack.pop();
            }else if(stack.peek() == '{' && s.charAt(i) == '}'){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty())
            return true;
        else 
            return false;
    }

