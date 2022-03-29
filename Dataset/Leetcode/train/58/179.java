 class Solution {
    public int XXX(String s) {
        char[] chars = s.toCharArray();
        boolean bk = true;
        int res = 0;
        for (int i = chars.length-1; i >= 0; i--) {
            if (chars[i]==' '&&bk) continue;
            else bk = false;
            if (chars[i]==' ') break;
            res++;
        }
        return res;
    }
}

