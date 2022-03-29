class Solution {
    public int XXX(int x) {
//         用long来保存可以减少判断，算是取巧了
        long ans = 0;
//         无视正负，翻转数字
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
//         判断是否越界
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            ans = 0;
        }
        return (int) ans;
    }
}

