 class Solution {
    public boolean XXX(String s) {
        int length = s.length();
        if(length%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        int p1 = '('+')';
        int p2 = '{'+'}';
        int p3 = '['+']';
        for(int i=0;i<length;i++){
            char c = s.charAt(i);
            if(stack.empty()){
                stack.push(c);
            }else{
                int sum = stack.peek()+c;
                if(sum==p1||sum==p2||sum==p3){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.empty();
    }
}

