class Solution {
    public int XXX(String s) {
        s= s.trim();
        int i = s.length()-1;
        while(i>=0&&s.charAt(i)!=' ') i--;
        return s.length()-i-1;

    }
}

