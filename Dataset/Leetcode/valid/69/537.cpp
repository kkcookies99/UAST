class Solution {
public:
    int XXX(int x) {
        if (x == 0) return 0;
        if (x == 3 || x == 2 || x == 1) return 1;
        int left = 2, right = x / 2, mid = 0, div = 0;
        while (left <= right) { // 二分查找
            mid = left + (right - left) / 2;
            div = x / mid;
            if (mid == div || (mid < div && x / (mid + 1) < (mid + 1))) {
                break;  // 如果 mid * mid == x 或者 mid * mid < x && (mid + 1) * (mid + 1) > x 则返回 mid
            } else if (mid > div) {
                right = mid - 1;
            } else if (mid < div) {
                left = mid + 1;
            }
        }
        return mid;
    }
};

