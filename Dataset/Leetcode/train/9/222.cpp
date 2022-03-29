class Solution {
public:
    bool XXX(int x) {
        if(x < 0) return false;
        int div = 1;
        while(x / div >= 10) {
            div *= 10;
        }
        while(x > 0) {
            int f, l;
            l = x % 10;
            f = x / div;
            if(l != f)
                return false;
            x = x % div / 10;
            div = div / 100;
        }
        return true;
    }
};

