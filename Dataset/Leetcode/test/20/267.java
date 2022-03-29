 class Solution {
    public boolean XXX(String s) {
       Stack<Character> stack = new Stack<>();
		if(s.isEmpty()) {
			return true;
		}
		
		char[] ch = s.toCharArray();
		stack.push('1');
		stack.push(ch[0]);
		
		for(int i = 1 ; i < ch.length ; i++) {
			if(stack.peek()=='(' && ch[i]==')') {
				stack.pop() ;
				continue;
			}
			if(stack.peek()=='[' && ch[i]==']') {
				stack.pop() ;
				continue;
			}
			if(stack.peek()=='{' && ch[i]=='}') {
				stack.pop() ;
				continue;
			}
				stack.push(ch[i]);
		}
		if(stack.peek()=='1') {
			return true;
		}
        return false;
    }
}

