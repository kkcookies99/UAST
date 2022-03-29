 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='(' || x=='[' || x=='{' || stack.empty()) stack.push(x); 
            else{
                char top=stack.peek();
                if(top==')' || top=='}' || top==']') return false; 
                if(top=='(' && x==')' || top=='{' && x=='}'  || top=='[' && x==']') stack.pop();
                else stack.push(x);
            }
        }
        return stack.empty();
    }
}

