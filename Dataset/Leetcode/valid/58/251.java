 class Solution {
    public int XXX(String s) {
        int res = 0;
        // 1. 去掉后导空格
        int i = s.length() - 1; 
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // 2. 只要不是空格, res++
        while (i >= 0 && s.charAt(i) != ' ') {
            res++;
            i--;
        }

        return res;
    }
}

