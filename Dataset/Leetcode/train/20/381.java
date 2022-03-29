 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        if (len==0||s.isEmpty()){
            return true;
        }
        if (len%2==1)
            return false;
        stack.push(s.charAt(0));
        for (int i = 1; i < len; i++) {
            char cur = s.charAt(i);
            if (cur=='('||cur=='['||cur=='{'){
                stack.push(cur);
            }
            if ((cur==')'||cur==']'||cur=='}')&&stack.isEmpty()){
                return false;
            }
            if (cur==')'&&!stack.isEmpty()){
                if (stack.pop()!='(')
                    return false;
            }
            if (cur==']'&&!stack.isEmpty()){
                if (stack.pop()!='[')
                    return false;
            }
            if (cur=='}'&&!stack.isEmpty()){
                if (stack.pop()!='{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}

