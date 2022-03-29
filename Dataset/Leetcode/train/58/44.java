 class Solution {
    public int XXX(String s) {
        if(s==null || s.equals("")) return 0;
        String[] s1 = s.split(" ");
        if(s1.length==0) return 0;
        String lastString = s1[s1.length- 1];
        return lastString.length();
    }
}

