 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i < chars.length;i++){
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                stack.push(chars[i]);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = stack.peek();
                if ((pop == '(' && chars[i] == ')') || (pop == '[' && chars[i] == ']') || (pop == '{' && chars[i] == '}')){
                    stack.pop();
                    continue;
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

