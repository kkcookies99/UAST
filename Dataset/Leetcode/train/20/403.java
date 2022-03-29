 class Solution {
    public boolean XXX(String s) {
        char[] stack = new char[s.length()];
        int index = 0;
        stack[0] = s.charAt(0);
        for(int i = 1; i < s.length(); i++) {
            if(index >= 0 && match(stack[index], s.charAt(i))) {
                index--;
            } else {
                index++;
                stack[index] = s.charAt(i);
            }
        }
        return index == -1;
    }
    public boolean match(char a, char b) {
        if(a == '(' && b == ')') return true;
        if(a == '[' && b == ']') return true;
        if(a == '{' && b == '}') return true;
        return false;
    }
}

