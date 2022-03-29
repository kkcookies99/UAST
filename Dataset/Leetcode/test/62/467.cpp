class Solution {
public:
    int XXX(int m, int n) {
        if(n > m) return XXX(n, m);
        
        int res = 1;
        for(int x = n + m - 2, i = 1; i < n; i++){
            res = 1LL * res * (x - i + 1) / i;
        }

        return res;
    }
};

