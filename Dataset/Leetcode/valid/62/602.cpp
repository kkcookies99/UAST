class Solution {
public:
    int XXX(int m, int n) {
        if(m==1 || n==1)
            return 1;
        --m;
        --n;
        int total=m+n;
        int bigger=max(m,n),lower=total-bigger;
        long long result=1;
        for(int i=bigger+1;i<=total;++i)
            result*=i;
        for(int i=2;i<=lower;++i)
            result/=i;
        return result;
    }
};

