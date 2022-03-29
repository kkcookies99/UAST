     public boolean XXX(String s) {
       Stack<Character> stack= new Stack<>();
       for(int i = 0;i < s.length();i++)
       {
         char c = s.charAt(i);
         if(c == '('|| c =='{'||c == '[')
         {
             stack.push(c);
         }else{
             if (!stack.isEmpty()){
                 char f = stack.pop();
                 if (f == '(' && c != ')') {
                     return false;
                 }
                 if (f == '{' && c != '}') {
                     return false;
                 }
                 if (f == '[' && c != ']') {
                     return false;
                 }
             }else{
                 return  false;
             }
         }
       }
       if (!stack.isEmpty())
       {
           return false;
       }
       return  true;
    }
}

