 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(symbol);
                continue;
            }
            switch (symbol) {
                case ')': {
                    if (!(stack.pop() == '(')) {
                        return false;
                    }
                    break;
                }
                case ']': {
                    if (!(stack.pop() == '[')) {
                        return false;
                    }
                    break;
                }
                case '}': {
                    if (!(stack.pop() == '{')) {
                        return false;
                    }
                    break;
                }
                default : stack.push(symbol);
            }
        }
        return stack.isEmpty();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


