 public boolean XXX(String s) {
        Stack<Character> leftStack = new Stack<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (isLeft(ch)) {
                leftStack.add(ch);
            } else {
                Character left;
                try {
                    left = leftStack.pop();
                } catch (RuntimeException e) {
                    return false;
                }
                if (left == '(' && ch == ')') {
                    continue;
                } else if (left == '[' && ch == ']') {
                    continue;
                } else if (left == '{' && ch == '}') {
                    continue;
                }
                return false;
            }
        }
        return leftStack.isEmpty();
    }

    public boolean isLeft(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }

