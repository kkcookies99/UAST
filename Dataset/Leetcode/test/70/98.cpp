class Solution {
public:
    int XXX(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        return XXX(n-1)+XXX(n-2);
    }
};

