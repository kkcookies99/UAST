 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            char pc =  chars[i];
            if (pc=='('||pc=='['||pc=='{'){
                stack.push(pc);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char pop =  stack.pop();
            if (pop=='('&&pc==')'||pop=='['&&pc==']'||pop=='{'&&pc=='}'){
                continue;
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}

