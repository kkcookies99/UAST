 class Solution {
    public boolean XXX(String s) {
        s = s.toLowerCase();

        Set<Character> ok = new HashSet<Character>();
        for(char i = '0'; i <= '9'; ++ i) {
            ok.add(i);
        }
        for(char i = 'a'; i <= 'z'; ++ i) {
            ok.add(i);
        }

        int l = 0, r = s.length()-1;
        while(l < r) {
            char lc = s.charAt(l);
            char rc = s.charAt(r);
            if(!ok.contains(lc)) {++ l; continue;}
            if(!ok.contains(rc)) {-- r; continue;}
            if(lc != rc) return false;
            ++l; -- r;
        }
        return true;
    }
}

