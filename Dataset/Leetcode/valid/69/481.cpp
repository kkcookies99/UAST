class Solution {
public:
    int XXX(int x) {
        if(x == 0){
            return 0;
        }
        double zeta = 1.0e-6;
        double xi = x, xi_1 = 0;
        while(true){
            xi_1 =  (xi * xi + x) / (2 * xi);
            if(xi - xi_1 < zeta){
                break;
            }
            xi = xi_1;
        }
        return int(xi_1);
    }
};

