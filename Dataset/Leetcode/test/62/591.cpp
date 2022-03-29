class Solution {
public:
    int XXX(int m, int n) {
        int sum=0;
        if(m==1&&n==1) return 1;
        if(m<1||n<1) return 0;
        sum=XXX(m-1,n)+XXX(m,n-1);
        return sum;
    }
};

