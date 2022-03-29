 class Solution {
public:
    int XXX(int x) {
        if (x < INT_MIN || x > INT_MAX) return  0;
        long ans = 0;
        long flag = (x > 0) ? 1 : -1;
        x = abs(x);
        while (x > 0) {
            ans = (long)ans * 10 + x % 10;
            x /= 10;
        }
        ans *= flag;
        if (ans < INT_MIN || ans > INT_MAX) return 0;
        return ans;
    }
};

