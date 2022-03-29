 class Solution {
    public boolean XXX(String s) {
        Stack<Character>stack=new Stack<>();
        HashMap<Character,Character>map=new HashMap<>();
        map.put(')','(');map.put(']','[');map.put('}','{');
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()||!map.containsKey(ch)) stack.push(ch);//当栈为空或左括号则入栈
            else if(stack.peek()!=map.get(ch)) return false;//当前是右括号且与栈顶不匹配,返回false
            else stack.pop();//匹配，弹出左括号
        }
        return stack.isEmpty();
    }
}

