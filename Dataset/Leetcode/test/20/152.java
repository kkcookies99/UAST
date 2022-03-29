 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c =='[') {
                stack.push(c);
            } else if (stack.isEmpty() || (c == ')' && stack.peek() != '(')) {
                return false;
            } else if (stack.isEmpty() || (c == '}' && stack.peek() != '{')) {
                return false;
            } else if (stack.isEmpty() || (c == ']' && stack.peek() != '[')) {
                return false;
            } else {
                stack.pop();
            }
        }
		
        if (stack.isEmpty()) {
            return true;
	} else {
	    return false;
	}
    }
}

