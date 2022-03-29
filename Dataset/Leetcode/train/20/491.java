 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] str = s.toCharArray();
        for(char elem:str){
            if(elem == '('){
                stack.push(')');
            }else if(elem == '['){
                stack.push(']');
            }else if(elem == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || elem != stack.pop()){
                return false;
            }
        }

        return stack.isEmpty();
    }
}

