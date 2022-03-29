 public boolean XXX(String s) {
        // 题目有假设，不做校验
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!stack.isEmpty()) {
                char top = stack.peek();
                if ((top == '(' && current == ')') || (top == '[' && current == ']') || (top == '{' && current == '}')) {
                    stack.pop();
                } else {
                    stack.push(current);
                }
            } else {
                stack.push(current);
            }
        }
        return stack.isEmpty();
    }

