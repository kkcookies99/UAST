class Solution {
public:
    int XXX(int n) {
        if (n == 1 || n == 2) return n;
        int a = 1, b = 2;
        while (n-- > 2)
        {
            b = a + b;
            a = b - a;
        }
        return b;
        // int *ways = new int[n]{}, ans;
        // ways[0] = 1;
        // ways[1] = 2;
        // for (int i = 2; i < n; ++i)
        //     ways[i] = ways[i - 1] + ways[i - 2];
        // ans = ways[n - 1];
        // delete[] ways;
        // return ans;
    }
};

