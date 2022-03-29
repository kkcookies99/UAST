class Solution {
public:
    int XXX(int x) {
        int l = 0, r = x/2 + 1;

        while (l < r) {
            long mid = l + (r - l)/2;
            if (mid * mid > x)
                r = mid - 1;
            else if (mid * mid < x) {
                // 防止死循环
                if ((mid+1)*(mid+1) > x)
                    return mid;
                l = mid+1;
            }
            else
                return mid;
        }

        return l;
    }
};

