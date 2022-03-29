 class Solution {
public:
    int XXX(int m, int n) 
    {
        long long t = 1;
        if(m < n)swap(m,n);
        for(int i = m;i <= m + n - 2;i++)t *= i;
        for(int i = 1;i < n;i++)t /= i;
        return t;
    }
};

