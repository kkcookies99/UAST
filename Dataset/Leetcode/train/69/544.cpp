class Solution {
public:

    int XXX(int x) {
        if(x == 0) return 0;
        long long x_k = x;
        while(x_k > x/x_k){
            x_k = (x_k + x/x_k)/2;
        }
        return int(x_k);
    }
};

