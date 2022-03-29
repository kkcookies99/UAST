     public boolean XXX(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.empty() || stack.pop().charValue() != map.get(c).charValue()) {
                return false;
            } 
        }
        return stack.isEmpty();
    }

