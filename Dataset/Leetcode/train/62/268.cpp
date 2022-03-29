 class Solution {
public:
    int XXX(int m, int n) {
        int A[100] = { 0 };
        for (int i = 0; i < n; i++) A[i] = 1;
        for (int i = 1; i < m; i++) 
            for (int j = 1; j < n; j++)
                A[j] = A[j - 1] + A[j];

        return A[n - 1];
    }
};

