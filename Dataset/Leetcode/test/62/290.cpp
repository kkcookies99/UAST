 class Solution {
public:
    int XXX(int m, int n) {
        // C_(m+n-2)^(n-1) = fac(m+n-2)/(fac(n-1)*fac(m-1))

        //注意：Gamma函数 G(n+1) == n!
        return round(tgamma(1 + m+n-2)/(tgamma(1 + n-1)*tgamma(1 + m-1)));
    }
};

