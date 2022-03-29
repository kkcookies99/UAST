 class Solution {
    public int XXX(String s) {
        String str = s.trim();
        String[] word = str.split(" ");
        int len = word[word.length - 1].length();
        return len;
    }
}

