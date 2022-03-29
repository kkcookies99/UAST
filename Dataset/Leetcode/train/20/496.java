 class Solution {
    public boolean XXX(String s) {
        while(s.indexOf("()") != -1 || s.indexOf("{}") != -1 || s.indexOf("[]") != -1){
            if(s.indexOf("()") != -1){
               s =  s.replace("()","");
            }
            if(s.indexOf("{}") != -1){
               s =  s.replace("{}","");
            }
            if(s.indexOf("[]") != -1){
                s = s.replace("[]","");
            }
        }
        return s.length()==0;
    }
}

