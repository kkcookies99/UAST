class Solution {
public:
    int XXX(int m, int n) {
        if(m==1 || n==1) return 1;
        return XXX(m-1,n)+XXX(m,n-1);
    }
};

