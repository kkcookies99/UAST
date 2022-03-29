 class Solution {
    public int XXX(String s) {
        if (s == null || s.length() == 0) return 0;
        
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}

