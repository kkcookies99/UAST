 class Solution {
    public int XXX(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0 ) return 0;
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }
}

