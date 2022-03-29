 class Solution {
    public boolean XXX(String s) {
       int l=s.length();
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<l;i++){
			if(stack.isEmpty()){
				stack.push(s.charAt(i));
			}else if(s.charAt(i)=='}'&&stack.peek()=='{'||s.charAt(i)==']'&&stack.peek()=='['||s.charAt(i)==')'&&stack.peek()=='('){
				stack.pop();
			}else{
				stack.push(s.charAt(i));
			}
		}
		if(stack.isEmpty())
			return true;
		return false;
    }
}

