class Solution {
public:
    int XXX(int n) {
        if(n == 1 || n == 2) return n;
        int f[n+1];
        f[1] = 1;
        f[2] = 2;
        for(int i=3;i<=n;i++) f[i] = f[i-1] + f[i-2];
        return f[n];
    }
};

