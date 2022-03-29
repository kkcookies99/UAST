class Solution {
public:
    int XXX(int x) {
        int l = 0, r = x;

        while(l < r){
            long mid  = (long)l + r + 1 >> 1;

            if((long long) mid * mid <= x) l = mid;
            else r = mid - 1;
        }

        return r;
    }
};

