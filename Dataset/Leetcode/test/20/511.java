 class Solution {
    public boolean XXX(String s) {
        int n = s.length();
        if(n%2==1){
            return false;
        }
        Deque<Character> stack = new LinkedList<Character>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char topElement = stack.pop();
                if(ch==')'&&topElement!='('){
                    return false;
                }
                if(ch==']'&&topElement!='['){
                    return false;
                }
                if(ch=='}'&&topElement!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

