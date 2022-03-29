class Solution {
public:
    int XXX(int x) {
        long long tmp = x >> 1;
        while(tmp * tmp > x)
        {
            tmp = tmp >> 1;
        }
        while(tmp * tmp < x)
        {
            tmp += 10;
        }
        while(tmp * tmp > x)
            --tmp;
        return tmp;
    }
};

