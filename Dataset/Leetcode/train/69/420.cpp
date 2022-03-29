class Solution {
public:
    int XXX(int x) {
        int l = 0, r = x / 2 + 1;
        while(l < r) {
            int mid = l + r + 1 >> 1;
            if(mid <= x / mid) l = mid;
            else r = mid - 1;
        }
        return r;
    }
};

