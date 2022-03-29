 public boolean XXX(String s) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i < s.length(); i++){
            char cha = s.charAt(i);
            if(cha == ')'){
                if(stack.empty() || stack.pop() != '(') return false;
            }
            else if(cha == '}'){
                if(stack.empty() || stack.pop() != '{') return false;
            }
            else if(cha == ']'){
                if(stack.empty() || stack.pop() != '[') return false;
            }
            else{
                stack.push(cha);
            }
        }
        return stack.empty() ? true : false;
    }

