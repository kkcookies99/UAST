 class Solution {
    public int XXX(String s) {
        char[] chs = s.toCharArray();
        int len = 0;
        boolean flag = false;
        for(int i = chs.length - 1; i >= 0; i--) {
            if((chs[i] >= 'a' && chs[i] <= 'z') || (chs[i] >= 'A' && chs[i] <= 'z')) {
                len++;
                flag = true;
            } else if (flag) {
                break;
            }
        }
        return len;
    }
}

