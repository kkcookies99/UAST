 class Solution {
    public boolean XXX(String s) {
        if(s == null || s.length() == 0 || s.length() == 1) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c : chars) {
           if(c == '(' || c == '[' || c == '{') {
               stack.push(c);
           } else {
               if(stack.size() == 0 || map.get(c) != stack.pop()){
                   return false;
               }
           }
        }
        return stack.size() == 0;
    }
}

