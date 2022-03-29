class Solution {
public:
    int XXX(int x) {
        if(x == 1 || x == 0)
            return x;
        int l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if(x / mid < mid)
                r = mid - 1;
            else if(x / mid > mid)
                l = mid + 1;
            else
                return mid;
        }
        return r;
    }
};


