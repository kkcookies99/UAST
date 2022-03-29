class Solution {
    public int XXX(String s) {
        String s1 = s.trim();
        if (!s1.contains(" ")) {
            return s1.length();
        }
        String s2 = s1.substring(s1.lastIndexOf(" ")).trim();
        return s2.length();
    }
}

