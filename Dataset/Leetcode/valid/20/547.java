 class Solution {
    public boolean XXX(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        else{
            Stack<String> stack= new Stack<>();
            for(int i=0;i<s.length();i++){
                if(s.substring(i,i+1)=="(" || s.substring(i,i+1)=="[" || s.substring(i,i+1)=="{"){
                    stack.push(s.substring(i,i+1));
                }
                else if(s.substring(i,i+1)==")" && stack.peek()=="("){
                    stack.pop();
                }else if(s.substring(i,i+1)=="]" && stack.peek()=="["){
                    stack.pop();
                }else if(s.substring(i,i+1)=="}" && stack.peek()=="{"){
                    stack.pop();
                }else{
                    stack.push(s.substring(i,i+1));
            }
        }
            return stack.isEmpty();
        }
    }
}

