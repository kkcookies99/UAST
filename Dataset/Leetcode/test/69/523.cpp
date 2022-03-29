class Solution {
public:
    int XXX(int x) {
        double x0 = x;
        long t = *(long*)&x0;
        t = 0x5fe6f796b25e8c00 - (t>>1);
        double xh = double(x)/2;
        x0 = *(double*)&t;
        x0 = x0*(1.5 - xh*x0*x0);
        x0 = x0*(1.5 - xh*x0*x0);
        x0 = x0*(1.5 - xh*x0*x0);
        return 1/x0;
    }
};

