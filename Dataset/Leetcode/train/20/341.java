 class Solution {
    public boolean XXX(String s) {
        if(s == null || s.length() ==0){
            return true;
        }
        if(s.length()%2 !=0){return false;}
        char[] array = s.toCharArray();
        LinkedList<Character> stack = new LinkedList<>();
        for(int i = 0;i<array.length;i++){
            if(array[i]=='('|| array[i]=='[' || array[i]=='{'){
                stack.push(array[i]);
            }else if(array[i]==')'){
                if( !stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }else{return false;}
            }else if(array[i]==']'){
                if( !stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }else{return false;}
            }else if(array[i]=='}'){
                if( !stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                }else{return false;}
            }else{return false;}
        }
        return stack.isEmpty();
    }
}

