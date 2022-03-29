 class Solution {
    public boolean XXX(String s) {
        if(s.length()%2!=0||s.length()==0) return false;
        int i=0,flag1=0,flag2=0;
        Stack<Character> stack=new Stack<Character>();
        while(i<s.length()){
            switch(s.charAt(i)){
                case '(':
                case '[':
                case '{': flag1+=1; stack.push(s.charAt(i));break;
                case ')':                   
                    if(!stack.empty()&&stack.pop()!='(') return false;  
                    flag2+=1;               
                    break;
                case ']':
                    if(!stack.empty()&&stack.pop()!='[') return false;
                    flag2+=1;  
                    break;
                case '}':
                    if(!stack.empty()&&stack.pop()!='{') return false;
                    flag2+=1;  
                    break;
            }
            i++;
        }      
        if(flag1==flag2 && stack.empty()) return stack.empty();
        else return false;
    }
}

