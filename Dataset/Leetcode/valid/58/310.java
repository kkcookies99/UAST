 class Solution {
    public int XXX(String s) {
        if(s == null) return 0;
        int l = s.length() - 1;
        while (l >= 0 && s.charAt(l) == ' ') l--;
        int r = l;
        while (r >= 0 && s.charAt(r) != ' ') r--;
        return l - r;
    }
}

