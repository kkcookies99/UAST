 class Solution {
    public boolean XXX(String s) {
        String ss=s.toLowerCase();
        String sss="";
        for(int i=0;i<s.length();i++)
            if((ss.charAt(i)>='a'&&ss.charAt(i)<='z')||(ss.charAt(i)>='0'&&ss.charAt(i)<='9'))
                sss+=ss.charAt(i);
        return parse(sss);
    }
    
    public boolean parse(String s){
        if(s==null) return true;
        else if(s.length()<=1) return true;
        else if(s.charAt(0)==s.charAt(s.length()-1))
            return parse(s.substring(1,s.length()-1));
        else return false;
    }
}

