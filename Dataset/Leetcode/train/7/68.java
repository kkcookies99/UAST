class Solution {
    public int XXX(int x) {
        String s = x + "";
        char[] strs = s.toCharArray();
        int i, j = s.length()-1;
        int res;
        // 负数，跳过负号
        i = (x < 0 ? 1 : 0);    
        while ( i <= j) {
            char tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
            i++;
            j--;
        }
        try {
            int num = Integer.parseInt(new String(strs));
            res = num;
        } catch(NumberFormatException e) {
            return 0;
        }
        // return (( res>=-0x7fffffff && res <= 0x7fffffff) ? res : 0);
        return res;
    }
}

