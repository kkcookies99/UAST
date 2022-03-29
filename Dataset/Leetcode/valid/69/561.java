class Solution {
    public int XXX(int x) {
        
        if (x <= 1) {
            return x;
        }

        // 满足 m * m <= x，求 m 的最大值
        // 使用二分的右边界模板
        int l = 1;
        int r = x;

        while (l < r) {

            int mid = l + (r - l + 1) / 2;

            // 不要 mid * mid，会溢出！
            if (mid <= x / mid) {
                l = mid;
            } else {
                r = mid - 1;
            }

        }
        return l;
    }
}

