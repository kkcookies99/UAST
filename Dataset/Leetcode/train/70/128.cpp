class Solution {
public:
    int XXX(int n) {
        // f(n) = f(n-2) + f(n-1)
        // 1 2 3 5 8...
        long long a = 1;
        long long b = 1;
        while(n--) {
            b = a + b;
            a = b - a;
        }
        return a;
    }
};

