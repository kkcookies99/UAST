class Solution {
    long long pos = 1;
public:
    long long real_XXX(long long x){
        return (x<=-10 || x>=10)? (XXX(x/10) + x%10*(pos=pos*10)) : x;
    }
    int XXX(int x) {
        long long t = real_XXX((long long)x);
        return t<=2147483647 && t>=-2147483648? t : 0;
    }
};

