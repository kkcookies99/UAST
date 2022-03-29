 public boolean XXX(String s) {
        char[] chars = new char[s.length()];
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '}' && s.charAt(i) != ']' && s.charAt(i) != ')') {
				chars[index++] = s.charAt(i);
			} else if (index == 0) {
				return false;
			} else if (s.charAt(i) == '}' && chars[index - 1] == '{') {
				index--;
			} else if (s.charAt(i) == ']' && chars[index - 1] == '[') {
				index--;
			} else if (s.charAt(i) == ')' && chars[index - 1] == '(') {
				index--;
			} else {
				return false;
			}
		}
		return index == 0;
    }

