 class Solution {
    public boolean XXX(String s) {
        if(s==null) return false;
        int len = s.length();
        if(len%2!=0) return false;
        char[] chars = new char[len];
        int p = 0;
        char c;
        for(int i=0; i<len; i++){
            c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                chars[p++] = c;
            } else {
                if(p<=0){
                    return false;
                } else if(c==')' && chars[p-1]=='('
                        || c==']' && chars[p-1]=='['
                        || c=='}' && chars[p-1]=='{'){
                    p--;
                } else {
                    return false;
                }
            }
        }
        return p==0;
    }
}

