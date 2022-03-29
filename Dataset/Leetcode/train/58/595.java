class Solution {
    public int XXX(String s) {
        String[] sp = s.split(" ");
        return sp[sp.length - 1].length();
        
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ')
            i--;
            
        int res = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            res++;
            i--;
        }
        return res;
    }
}



