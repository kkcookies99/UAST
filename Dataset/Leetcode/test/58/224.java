 class Solution {
    public int XXX(String s) {
        s = s.trim();
        int i ;
        for (i = s.length()-1; i >= 0 && (s.charAt(i) != ' '); i--);
        
        return s.length() - i - 1;
    }
}

