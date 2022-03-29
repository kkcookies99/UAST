class Solution {
    public int XXX(String s) {
        s = s.trim();
        int index = s.lastIndexOf(" ");
        return s.length() - (index+1);
    }
}

