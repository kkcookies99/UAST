 class Solution {
    public boolean XXX(String s) {
        Stack stack = new Stack();
        Map paren_map = new HashMap();
        paren_map.put(")","(");
        paren_map.put("}","{");
        paren_map.put("]","[");
        if(s.equals("")) return true;
        for (String str:s.split("")) {
            if(paren_map.containsKey(str)){
                if(stack.isEmpty()) return false;
                if (!paren_map.get(str).equals(stack.peek()))
                    return false;
                else stack.pop();
            }else {
                stack.push(str);
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
        
    }
}

