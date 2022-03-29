class Solution {
public:
    int XXX(int x) {
        int l = 0, r = x;
        if(x == 0 || x == 1) return x;
        while(l <= r){
            int mid = (l + r) >> 1;
            if(mid <= x / mid) l = mid + 1;
            else r = mid - 1;
        }
        return r;
    }
};

