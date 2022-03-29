class Solution {
    public int XXX(String s) {
        int lastWordLength = 0;
        int strLength = s.length();
        for (int i=strLength-1; i>=0; i--) {
            if (s.charAt(i) == ' ' && lastWordLength == 0) {
                continue;
            }
            if (s.charAt(i) == ' ' && lastWordLength != 0) {
                break;
            }
            lastWordLength++;
        }
        return lastWordLength;
    }
}

