class Solution {
public:
    int XXX(int x) {
        if (x<=1) return x;
        long i=x, n=x/i;
        while (i>n){
            i=(i+n)/2;
            n=x/i;
        }
        return i;
    }
};

