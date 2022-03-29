class Solution {
    public int XXX(String s) {
        StringBuilder ss = new StringBuilder();
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            String sp = String.valueOf(s.charAt(i));
            int index = ss.indexOf(sp);
            if (index>=0) ss.delete(0,index+1);
            ss.append(sp);
            int slen = ss.length();
            if (slen>len) len = slen;
        }
        return len;
    }
}

