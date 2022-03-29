 public boolean XXX(String s) {
        if (s.length()%2!=0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] str=s.toCharArray();
        int i=0;
        try {
            while (i<s.length()){
                if (str[i]=='['||str[i]=='{'||str[i]=='('){
                    stack.push(str[i]);
                    i++;
                }
                if (str[i]==']'||str[i]=='}'||str[i]==')'){
                    if (stack.peek()=='['&&str[i]==']'){
                        stack.pop();
                        i++;
                        continue;
                    }
                    if (stack.peek()=='{'&&str[i]=='}'){
                        stack.pop();
                        i++;
                        continue;
                    }
                    if (stack.peek()=='('&&str[i]==')'){
                        stack.pop();
                        i++;
                        continue;
                    }
                    return false;
                }
            }
        }catch (Exception e){
            return false;
        }
      return stack.isEmpty();
    }

