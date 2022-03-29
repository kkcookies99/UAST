class Solution {
public:
    int XXX(int x) {
        int l = 0;
        int r = x;
        while (l < r)
        {
            int mid = (l + r) / 2;
            if ((long long) mid * mid == x) return mid;
            else if ((long long) mid * mid < x) l = mid + 1;
            else r = mid - 1;
        }
        return (long long) l * l <= x ? l : l - 1;
    }
}

