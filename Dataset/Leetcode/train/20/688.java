 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
                stack.push(s.charAt(i));
            }else if(stack.size()>0&&stack.peek()=='('&&s.charAt(i)==')') {
                stack.pop();
            }else if(stack.size()>0&&stack.peek()=='['&&s.charAt(i)==']') {
                stack.pop();
            }else if(stack.size()>0&&stack.peek()=='{'&&s.charAt(i)=='}') {
                stack.pop();
            }else {
                return false;
            }
        }
        if(stack.size()==0) {
            return true;
        }
        return false;
    }
}
code block

