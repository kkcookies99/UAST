 class Solution {
    public boolean XXX(String s) {
        int len = s.length();
        char[] ch = new char[len];
        int top = -1;
        for(int i = 0; i < len; i++){
            if(top==-1) ch[++top] = s.charAt(i);
            else if(s.charAt(i)==')'&&ch[top]=='(') top--;
            else if(s.charAt(i)==']'&&ch[top]=='[') top--;
            else if(s.charAt(i)=='}'&&ch[top]=='{') top--;
            else ch[++top] = s.charAt(i);
        }
        return top==-1;
    }
}

