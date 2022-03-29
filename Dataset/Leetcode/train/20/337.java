 public boolean XXX(String s) {
           Stack<Integer> stack = new Stack<>();
、	for (int i = 0; i < s.length(); i++) {
		switch (s.charAt(i)) {
		case '(':
		case '{':
		case '[':
			stack.push(s.charAt(i) / 40);
			break;
	、	default:
、			if (stack.isEmpty() || stack.pop() != s.charAt(i)/40)
				return false;
			break;
		}
	}
	return stack.isEmpty();    
}

