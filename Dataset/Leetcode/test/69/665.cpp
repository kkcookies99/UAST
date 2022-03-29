class Solution {
public:
    int XXX(int x) {
        if(x<=1) return x;

        // 牛顿迭代
        int ans=x/2;
        while(ans>x/ans) ans=((x/ans)+ans)/2;
        return ans;

        // 求任意正数的平方根 牛顿迭代
        // if(x<=1) return x;
        // double ans=x/2.0;
        // double dx=1.0;
        // while(dx>1e-7)
        // {
        //     ans=(x/ans+ans)/2.0;
        //     dx=fabs(ans*ans-x);
        // }
        // return ans;
    }
};

