class Solution {
public:
    int XXX(int m, int n) {
        if(n > m){
            int t = n;
            n = m;
            m = t;
        }
        double a = 1; 
        for(int i = 1; i <= n - 1; ++i){
            a *= (m + n - 1 - i);
            a /= i;
        }
        return a;
    }
};

