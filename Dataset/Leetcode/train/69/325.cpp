class Solution {
public:
    int XXX(int x) {
        if (x == 0) return 0;
        int l = 0, r = x;
        long long mid;
        while (l <= r) {
            mid = (l + r) >> 1;
            long long square = mid * mid;
            if (square == x) {
                return mid;
            }
            else {
                if (square < x) {
                    if (square + 2 * mid + 1 > x) {
                        return mid;
                    }
                    else {
                        l = mid + 1;
                    }
                }
                else {
                    if (square - 2 * mid + 1 < x) {
                        return mid - 1;
                    }
                    else {
                        r = mid - 1;
                    }
                }
            }
        }
        return mid;
    }
};

