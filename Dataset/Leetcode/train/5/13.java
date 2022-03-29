class Solution {
    public String XXX(String s) {
        if(isHuiwen(s))
        return s;
    return XXX(s.substring(0,s.length()-1)).length()>XXX(s.substring(1,s.length())).length()?XXX(s.substring(0,s.length()-1)):XXX(s.substring(1,s.length()));

    }
     public static boolean isHuiwen(String s){
        if(s.length()==1)
            return true;
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;

        }
        return true;


    }
}

