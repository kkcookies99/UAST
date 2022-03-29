class Solution {
    public int XXX(String s) {
        while (s.charAt(s.length() - 1) == ' '){
            s = s.substring(0 , s.length() - 1);
        }
        
            
        
        StringBuilder ss = new StringBuilder();
        for (int i = s.length() -1 ; i >= 0; i--) {
            if (s.charAt(i) == ' ')break;
            ss.append(s.charAt(i));
            
        }
        return ss.length();
    }
}

