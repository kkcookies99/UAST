class Solution {
public:
    int XXX(int x) {
        if (x == INT_MIN || x == INT_MAX) return 0;
        long long ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        if (ans < INT_MIN || ans > INT_MAX) return 0;
        return (int)ans;
    }
};

