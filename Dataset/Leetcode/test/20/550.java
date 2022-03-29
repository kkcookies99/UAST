 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isLeft(ch)){
                stack.push(ch);
            }else if (stack.isEmpty()||!isMatch(stack.pop(),ch)){
                return false;
            }
        }
        return stack.isEmpty()?true:false;
    }

    public boolean isMatch(char ch1, char ch2) {
        switch (ch1) {
            case '(':
                return ch2 == ')' ? true : false;
            case '[':
                return ch2 == ']' ? true : false;
            case '{':
                return ch2 == '}' ? true : false;
        }
        return false;
    }

    public boolean isLeft(char ch1) {
        if (ch1 == '(' || ch1 == '[' || ch1 == '{') return true;
        return false;
    }

}

