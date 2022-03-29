 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack=new Stack();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                if(s.charAt(i)==']'){
                    if(stack.pop()=='[') continue;
                    return false;
                }
                if(s.charAt(i)=='}'){
                    if(stack.pop()=='{') continue;
                    return false;
                }
                if(s.charAt(i)==')'){
                    if(stack.pop()=='(') continue;
                    return false;
                }
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            if(stack.size()%2!=0){
                return false;
            }
            char n=stack.pop(),m=stack.pop();
            if(n=='}'&&m=='{') return true;
            if(n==')'&&m=='(') return true;
            if(n==']'&&m=='[') return true;
            return false;
        }
        
    }
}