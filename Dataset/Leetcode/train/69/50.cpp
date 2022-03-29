class Solution {
public:
    int XXX(int y) {
        // f(x) = x^2 - y
        // x_{n+1} = x_n - f(x_n)/f'(x_n)
        int x = y/2 +  1;
        while( (long)x * x - y > 0){
            x = (x + y/x)/2;
        }
        return x;
    }
};

