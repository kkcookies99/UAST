 class Solution {
    public boolean XXX(String s) {
        ArrayDeque<Character> queue=new ArrayDeque<>();
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='(')
               queue.add(')');
            else if(s.charAt(i)=='{')
               queue.add('}');
            else if(s.charAt(i)=='[')
               queue.add(']');
            else{
                if(queue.isEmpty()||queue.peekLast()!=s.charAt(i))
                    return false;
                else
                    queue.pollLast();
            }
        }
        return queue.isEmpty();
    }
}

