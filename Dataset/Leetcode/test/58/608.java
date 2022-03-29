class Solution {
    public int XXX(String s) {
        String str=s.trim();
        int len=str.substring(str.lastIndexOf(" ")+1).length();
        return len;
    }
}

