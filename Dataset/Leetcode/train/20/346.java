 public boolean XXX(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.empty()) {
                stack.push(c);
                continue;
            }
            int i = Math.abs(stack.peek() - c);
            if (i == 1 || i == 2) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }

