 class Solution {
public:
    bool XXX(int x) {
        if(x < 0) return false;
        long t = x;
        long n =0;
        while(t) {
            n = n * 10 + t % 10;
            t /= 10;
        }
        //for(int i = 0; i < )
        if(n == x) return true;
        else return false;
    }
};

