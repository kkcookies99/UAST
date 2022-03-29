class Solution {
    public int XXX(String s) {
        int i = s.length()-1;
        int res = 0;
        // 从后往前扫描
        while ( i >= 0 ) {
            char ch = s.charAt(i);
            if ( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ) {
                res++;
            }
            i--;
            // 扫描到了最后一个单词
            if ( res != 0 && ch == ' ' ) {
                break;
            }
        }
        return res;
    }
}

