 class Solution {
    public int XXX(String s) {
        if (s.equals("")){
            return 0;
        }
        String[] s1 = s.trim().split(" ");
        return s1[s1.length - 1].length();
    }
}

