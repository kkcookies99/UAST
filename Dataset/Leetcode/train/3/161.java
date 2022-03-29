class Solution {
    public int XXX(String s) {
        int len = 1;
        int index = 0;
        if(s.equals("")) return 0;
        for (int i = 0; i < s.length(); i++) {
            String sc = String.valueOf(s.charAt(i));
            int indexOf = s.substring(index, i).indexOf(sc)+index;
            if (indexOf>=0) index = indexOf+1;
            len = Math.max(s.substring(index, i+1).length(), len);
        }
        return len;
    }
}

