 class Solution {
    public int XXX(String s) {
        String trim = s.trim();
        return trim.substring(trim.lastIndexOf(" ") + 1).length();
    }
}

