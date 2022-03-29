class Solution {
public:
    int XXX(int n) {
        if(n < 3) return n;
        int one_step = 2, two_step = 1, buf;
        for(int i = 2; i < n; ++ i){
            one_step > two_step ? two_step += one_step : one_step += two_step;
        }
        return max(one_step, two_step);
    }
};

