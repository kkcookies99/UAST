class Solution {
    public int XXX(String s) {
        int ret = 0;
        for(int i = s.length() - 1; i >= 0; --i) {
            if(ret > 0 && s.charAt(i) == ' ') break;
            if(s.charAt(i) != ' ') ret++;
        }
        return ret;
    }
}

