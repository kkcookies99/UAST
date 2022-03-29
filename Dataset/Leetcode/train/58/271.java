 class Solution {
    public int XXX(String s) {
        s = s.trim();
        int lastLoc = s.lastIndexOf(" ")+1;
        return s.length()-lastLoc;
    }
}

