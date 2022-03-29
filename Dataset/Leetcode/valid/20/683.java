 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++) {
            switch (s.charAt(i)) {
                case '(': stack.push(')'); break;
                case '[': stack.push(']'); break;
                case '{': stack.push('}'); break;
                case ')': 
                case '}':
                case ']': if (stack.isEmpty()||stack.pop()!=s.charAt(i)) return false; break;
            }                
            
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}


