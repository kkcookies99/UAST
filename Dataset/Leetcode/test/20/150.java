 class Solution {
    public boolean XXX(String s) {
        if(s.length()%2!=0) return false;
        Map<Character,Integer> map=new HashMap<>();
        map.put('(',0);
        map.put('{',1);
        map.put('[',2);
        map.put(']',3);
        map.put('}',4);
        map.put(')',5);
        Stack stack=new Stack();
        int i=1;
        char [] chars=s.toCharArray();
        stack.push(chars[0]);
        while (i<s.length()){
            if (map.get(chars[i])<3) {
                stack.push(chars[i]);
                i++;
                continue;
            }else if(stack.size()==0){
                return false;
            }
            int count=map.get(chars[i])+map.get(stack.pop());
            if(count==5){
                i++;
                continue;
            }else{
                return false;
            }
        }
        if (stack.size()!=0) return false;
        return true;
    }
}

