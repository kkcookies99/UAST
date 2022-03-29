class Solution {
public:
    int XXX(int x) {
        if( x == 0) return 0;
        int l = 1, r = x/2, mid;
        while(l < r) {
            mid = l + (r - l) / 2;
             if(mid > x / mid) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        return l;
    }
};

