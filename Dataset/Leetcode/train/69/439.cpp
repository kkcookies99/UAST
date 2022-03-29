class Solution {
public:
    int XXX(int y) {
        if (y==0 || y==1) return y;
        long int x1 = y/2;
        long int x;
        while (true) {
            x = (y + x1 * x1) / (2 * x1);
            if ((x*x) > y && (x-1)*(x-1) <= y) return x-1;
            if ((x*x) <= y && (x+1)*(x+1) > y) return x;
            x1 = x;
        }
        return -1;
    }
};

