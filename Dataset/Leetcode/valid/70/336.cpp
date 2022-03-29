class Solution {
public:
    int XXX(int n) {
        int a = 1, b = 1;
        int ans;
        if (n == 0 || n == 1) return 1;
        for (int i = 2; i <= n; i++){
            ans = a + b;
            a = b;
            b = ans;
        }
        return ans;
    }
};

