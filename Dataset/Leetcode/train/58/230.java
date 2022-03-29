 class Solution {
    public int XXX(String s) {
        int length = s.length();
        int res = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && i + 1 < length - 1 && s.charAt(i + 1) != ' ') {
                break;
            } 
            if (s.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }
}

