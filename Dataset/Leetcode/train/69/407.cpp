class Solution {
public:
    int XXX(int x) {
        if (x == 0) return 0;
        double x_i = x, C = x, eps = 1e-5; 
        while (true) {
            x_i = 0.5 * (x_i + C / x_i);
            if (x_i * x_i - C < eps) break; 
        }
        return int(x_i);
    }
};

