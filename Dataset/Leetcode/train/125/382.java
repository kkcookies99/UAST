 class Solution {
    public boolean XXX(String s) {
        
        int head = 0;
        int tail = s.length()-1;
        if(s.length() == 0) {
            return true;
        }
        
//        String regex = "^[A-Za-z0-9]+$";
//        Pattern p = Pattern.compile(regex);
        s = s.toUpperCase();
        
        while(head < tail) {
//            String h = String.valueOf(s.charAt(head));
//            String t = String.valueOf(s.charAt(tail));
            char h = s.charAt(head);
            char t = s.charAt(tail);
            
            if(!((h >= '0' && h <= '9') || (h >= 'A' && h <= 'Z'))) {
                head ++;
                continue;
            }
            if(!((t >= '0' && t <= '9') || (t >= 'A' && t <= 'Z'))) {
                tail--;
                continue;
            }
            if(h == t) {
                head ++;
                tail --;
            }else {
                return false;
            }
        }
        
        return true;
    
    }
}

