class Solution {
    public int XXX(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (res == 0) {
                    continue;
                } else {
                    break;
                }
            } else {
                res++;
            }
        }
        return res;
    }
}

