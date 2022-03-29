class Solution {
public:
    int XXX(int x) {
        long x0 = x;
        while (x0*x0>x){
            x0 = (x0+x/x0)/2;
        }
        return (int)x0;
    }
};

