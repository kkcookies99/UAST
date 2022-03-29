 class Solution {
    public boolean XXX(String s) {
        Stack<Character> s1=new Stack<>();
        int n=s.length();
        if(n<=0) return true;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') s1.push('(');
            else if(s.charAt(i)=='{') s1.push('{');
            else if(s.charAt(i)=='[') s1.push('[');

            if (s.charAt(i)==')'){
                if(s1.isEmpty()) return false;
                else{
                if(s1.peek()=='(') s1.pop() ; 
                else return false;
            }
            
            } 
            if (s.charAt(i)=='}'){
                if(s1.isEmpty()) return false;
                else{
                if(s1.peek()=='{') s1.pop() ; 
                else return false;
            }
            } 

            if (s.charAt(i)==']'){
                if(s1.isEmpty()) return false;
                else{
                if(s1.peek()=='[') s1.pop() ;
                else return false;
            }
            }
        }
        return s1.isEmpty();
    }
}

