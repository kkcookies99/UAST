 class Solution {
    public boolean XXX(String s) {
        Deque<Character> stack=new LinkedList<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()||Math.abs(stack.pop()-c)>2){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

