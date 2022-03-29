class Solution {
public:
    int XXX(int n) {
        double ans = 1./sqrt(5) * (pow((1+sqrt(5))/2,n+1)-pow((1-sqrt(5))/2,n+1));
        return int(ans+0.5);
    }
};

