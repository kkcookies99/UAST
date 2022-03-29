 class Solution {
public:
    int XXX(int m, int n) {
        int a[103] = { 1 };
        for (int i = 0; i < n; i++) 
            for (int j = 1; j < m; j++) 
                a[j] += a[j - 1];
        return a[m - 1];
    }
};

