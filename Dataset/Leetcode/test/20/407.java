 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                 stack.push(c);
            }else{
             if(c - stack.peek() == 2 || s.charAt(i) - stack.peek() == 1){
                stack.pop();
            }else{
                stack.push(c);
            } 
          }
        }
        if(stack.isEmpty()){return true;}
        else return false;
    }
}

