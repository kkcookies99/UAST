 class Solution {
public:
    int XXX(int m, int n) {
        int base = m + n -2;
        int top = m - 1;
        int ans = (tgamma(base+1))/(tgamma(top+1)*tgamma(base-top+1));
        return ans;
    }
};

