 class Solution {
    public boolean XXX(String s) {
        s = s.replaceAll("[\\pP‘’“”]", "");  
        s = s.replace(" ","");
        s = s.replace("`","");
        s = s.toLowerCase();
        for (int i = 0; i < s.length() / 2 ; i++) {
            if (s.charAt(i) != s.charAt(s.length() -1 - i)){
                return false;
            }
        }
        return true;
    }
}


