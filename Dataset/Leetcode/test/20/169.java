 class Solution {
    public boolean XXX(String s) {
        while(s.length()>1){
            if(s.contains("()"))
                s = s.replaceAll("\\(\\)","");
            else if(s.contains("[]"))
                s = s.replaceAll("\\[\\]","");
            else if(s.contains("{}"))
                s = s.replaceAll("\\{\\}","");
            else break;  
        }
        return s.length() == 0;
    }
}

