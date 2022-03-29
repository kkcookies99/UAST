class Solution {
public:
    int XXX(int x) {
        if (x==0) return 0;
        double c = x, x0 = x, xi=0;
        xi = 0.5*(x0+c/x0);
        while(fabs(x0-xi) > 1e-7){
            x0 = xi;
            xi = 0.5*(x0+c/x0);
        }
        return int(xi);
    }
};

