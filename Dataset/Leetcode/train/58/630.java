class Solution {
    public int XXX(String s) {
        int i = s.length()-1;
        int start = 0,end = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        end = i;
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        }
        start = i;
        return end-start;
    }
}

