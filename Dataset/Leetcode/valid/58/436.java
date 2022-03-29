class Solution {
    public int XXX(String s) {
        char[] ch = s.trim().toCharArray();
        int res = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] != ' ') res++;
            else break;
        }
        return res;
    }
}

