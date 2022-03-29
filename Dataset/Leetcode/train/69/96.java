class Solution {
    public int XXX(int x) {
        int left = 0;
        int right = x;
        int ans = 0;
        //为什么这里要left <= right，从case为x=0的角度思考。而且因为已经事先把答案存储在ans，所以left == right还继续也对其他样例无影响
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid > x) {
                // [left, mid]
                // 如果 mid * mid > x，那说明 mid 是完全无可能进入下一轮
                right = mid - 1;
            } else {
                // [mid, right]
                // 8 的算术平方根是 2.82842, 所以结果可能包括低位
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }
}

