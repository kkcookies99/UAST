  public boolean XXX(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>(4);
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if (!map.containsKey(stack.peek())) {
                    return false;
                }
                if (s.charAt(i) == map.get(stack.peek())) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }

        return stack.isEmpty();
    }

