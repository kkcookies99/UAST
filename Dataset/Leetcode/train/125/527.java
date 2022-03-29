 class Solution {
    public boolean XXX(String s) {
        if(s.length() == 0 || s == null)
        return true;
        s = s.toLowerCase();
        int i = 0; 
        int j = s.length()-1;
        while(i < j){
            while(i < j){
                if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
                break;
                i++;
            }
            while(i < j){
                if((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))
                break;
                j--;
            }
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

