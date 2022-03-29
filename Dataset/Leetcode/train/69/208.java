class Solution {
    public int XXX(int x) {
        int i = 1;
        // 如果i * i < x,则继续判断 (i+1) * (i+1)
        while (i <= x/i) {
            int res = i * i;
            if (res > x) return i - 1;
            if (res == x) return i;
            i++;
        }
        return i -1 ;
    }
}

