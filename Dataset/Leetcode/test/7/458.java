 public int XXX(int x) {
        String s = Integer.toString(x);
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            stack.push(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean temp = true;
        while (!stack.empty()){
            if (stack.peek() == '-' && stack.size() == 1){
                temp = false;
                stack.pop();
            }
            else {
                stringBuilder.append(stack.pop());
            }
        }
        String result = temp ? stringBuilder.toString() : '-' + stringBuilder.toString();
        try {
            return Integer.parseInt(result);
        }catch (NumberFormatException e){
            return 0;
        }
    }

