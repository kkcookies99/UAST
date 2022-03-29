 class Solution {
public:
    bool XXX(int x) {
        if (x == 0) return true;
        /*负数或者10的倍数的情况*/
        if (x < 0 || x%10 == 0) return false;
        
        /*翻转数字*/
        int t = 0;
        while (x > t) {
            t = t*10 + x%10;
            x /= 10;
        }

        /*偶数位和奇数位的情况*/
        return x == t || x == t/10;
    }
};

