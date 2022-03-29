 class Solution {
    public boolean XXX(String s) {
	int len = s.length();
	if(len % 2 != 0) return false;
	int[] index = new int[256];
	index['('] = ')';
	index['{'] = '}';
	index['['] = ']';
	Stack<Character> stack = new Stack<Character>();
	for(char ch : s.toCharArray()){
	    switch(ch){
		case '(':
		case '[':
		case '{':
		    stack.push(ch);
		    break;
		default:
		    if(stack.isEmpty() || index[stack.pop()] != ch) 
                        return false;
	    }
	}
	return stack.isEmpty();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

