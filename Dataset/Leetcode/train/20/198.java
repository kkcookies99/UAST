 class Solution {
    public boolean XXX(String s) {
        if(s.equals(""))
            return true;
        Stack<Character> x=new Stack<Character>();
        char popword;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
                x.push(s.charAt(i));
            else{
                if(!x.empty()){
                popword=x.pop();
                if(!((popword=='('&& s.charAt(i)==')')||(popword=='['&& s.charAt(i)==']')||(popword=='{'&& s.charAt(i)=='}')))
                    return false;
                else{
                    if(i==s.length()-1&&(x.empty()))
                        return true;}
                }
                else
                    return false;
            }
        }
        return false;   
    }
}
