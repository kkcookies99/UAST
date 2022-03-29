 class Solution {
    public boolean XXX(String s) {
        if(s == null || s.length() <=0){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();++i){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if(!stack.isEmpty() && (s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == '}' && stack.peek() == '{') || (s.charAt(i) == ']' && stack.peek() == '[')){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

