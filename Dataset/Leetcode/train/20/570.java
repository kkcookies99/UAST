 class Solution {
    public boolean XXX(String s) {
        LinkedList<Character> stk=new LinkedList<Character>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{')stk.add(c);
            else{
                if(stk.isEmpty())return false;
                char u=stk.removeLast();
                switch(c){
                    case ')':
                      if(u=='(')continue; else return false;
                    case ']':
                      if(u=='[')continue; else return false;
                    default: 
                      if(u=='{')continue; else return false;
                }
            }
        }
        return stk.isEmpty();
    }
}

