 class Solution {
    public boolean XXX(String s) {
        HashMap<Character,Character> h = new HashMap<Character,Character>();
        h.put(')','(');
        h.put(']','[');
        h.put('}','{');
        Stack<Character> sss = new Stack<Character>();
        char[] ss = s.toCharArray();
        for(char i:ss){
            if(i=='('||i=='['||i=='{') sss.push(i);
            else{
                if(h.containsKey(i)&&!sss.isEmpty()){
                    if(sss.peek() == h.get(i)){
                        sss.pop();
                    }else return false;
                }else return false;
                
            }
        }
        return sss.isEmpty();
    }
}

