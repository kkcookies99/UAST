class Solution {
     public boolean XXX(int x) {
        if (x<0) return false;
        //如果是回文 ，该数字反转后不会溢出
        int res = 0;
        int tem = x;
        while (x > 0) {
            res += x % 10;
            x /= 10;
            res = x > 0 ? res * 10 : res;
        }
        return res == tem;
    }
}

