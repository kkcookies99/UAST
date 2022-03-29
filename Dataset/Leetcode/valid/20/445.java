 class Solution {
    public boolean XXX(String s) {
if (s.length() < 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            char temp = chars[i];
            if (temp == ')' || temp == '}' || temp == ']') {
                stack.push(temp);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character mathRCh = stack.pop();
                switch (temp) {
                    case '(':
                        if (mathRCh != ')') {
                            return false;
                        }
                        break;
                    case '{':
                        if (mathRCh != '}') {
                            return false;
                        }
                        break;
                    case '[':
                        if (mathRCh != ']') {
                            return false;
                        }
                        break;

                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}

