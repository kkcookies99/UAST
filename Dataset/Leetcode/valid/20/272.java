  public boolean XXX(String s) {
        if ((s.length() & 1) == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (i == 0 || !p(stack.pop(), c)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    boolean p(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']');
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

