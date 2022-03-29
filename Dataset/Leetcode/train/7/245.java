class Solution {
    public int XXX(int x) {
        int res = 0;
        while (x != 0) {
            int yu = x % 10;
            int tmp = res * 10 + yu;
            if ((tmp - yu) / 10 != res) // 返回去求一下
                return 0;
            res = tmp;
            x /= 10;
        }
        return res;
    }
}

