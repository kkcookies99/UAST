 class Solution {
    public boolean XXX(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') stack.push(ch);
            //避免空指针
            else if(stack.size()==0) return false;

            else if(ch==stack.peek()+2 || ch==stack.peek()+1) stack.pop();

            else return false;
        }

        return stack.isEmpty();
    }
}

