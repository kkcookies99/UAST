class Solution {
public:
    int XXX(int x) {
        if (x < 2){
            return x;
        }
        
        double x0 = static_cast<double>(x);
        double x1 = (x0 + x / x0) / 2;
        while (abs(x0 - x1) >= 1){
            x0 = x1;
            x1 = (x0 + x / x0) /2;
        }
        
        return static_cast<int>(x1);
    }
};

