 class Solution {
public:
    int XXX(int a, int b) {
        // 一共消耗 a+b-2 步，其中 a-1 步向右走，b-1 步向下走
        // C(a+b-2,a-1) 或 C(a+b-2,b-1)
        // C(M,N) = C(M,N-1)*(M-N+1)/N
        // f(i) = f(i-1) * (M-i+1)/i, 参考最底下的注释
        // f(0) = 1, f(1) = M, f(2) = f(1) * (M-1)/2 = M*(M-1)/2 ...
        if (a == 0 || b == 0) return 0;
        long long res = 1;
        int m = a + b - 2;
        int n = a < b ? (a - 1) : (b - 1);
        
        for (int i = 1; i <= n; ++i) {
            res = res * (m-i+1)/i;
        }
        return res;
    }
    
    // (m!/n!(m-n)!) / (m!/(n-1)!(m-n+1)!) = (m-n+1)/n
};

