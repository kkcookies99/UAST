 class Solution {
    public boolean XXX(String s) {
        char [] stack = new char[10000];
        int pos = -1;
        for (char c : s.toCharArray()) {
            // 出栈
            if(pos > -1 && isPair(stack[pos],c)) {
                pos--;
                continue;
            }
            // 入栈
            stack[++pos] = c;
        }
        return pos == -1;
    }

    private boolean isPair(char popChr, char inputChr) {
        if(popChr == '(') {
            return inputChr == ')';
        }
        if(popChr == '[') {
            return inputChr == ']';
        }
        if(popChr == '{') {
            return inputChr == '}';
        }
        return false;
    }
}

