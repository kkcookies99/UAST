 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack=new Stack<>();
        char[] c=s.toCharArray();
        for(char c1:c){
            if(stack.empty()){
                stack.push(c1);
            }else if(c1==')'&&stack.peek()=='('){
                stack.pop();
            }else if(c1==']'&&stack.peek()=='['){
                stack.pop();
            }else if(c1=='}'&&stack.peek()=='{'){
                stack.pop();
            }else{
                stack.push(c1);
            }
        }
        return stack.empty();
    }
}

