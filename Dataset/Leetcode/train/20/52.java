 class Solution {
    public boolean XXX(String s) {
        LinkedList<Character> list = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (isLeft(c)) {
                //左括号，入栈
                list.push(c);
            } else {
                //右括号，上一个左括号与之不匹配，不用再判断了，直接返回
                if (list.isEmpty() || !isMatch(list.pop(), c)) {
                    return false;
                }
            }
        }
        return list.isEmpty();
    }
    private boolean isLeft(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isMatch(char a, char b) {
        switch (a) {
            case '(':
                return b == ')';
            case '[':
                return b == ']';
            case '{':
                return b == '}';
            default:
                return false;
        }
    }
}

