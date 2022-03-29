 class Solution {
public:
    bool XXX(int x) {
        if(x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int x_t = 0;
        while(x > x_t) {
            x_t = x_t * 10 + x % 10;
            x = x / 10;
        } 
        return x == x_t || x == x_t / 10;

    }
};

