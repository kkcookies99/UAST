class Solution {
public:
    int XXX(int n) {
        if(n<2) return 1;
        int one = 1, two = 1, tmp = 0;
        for(int i=2;i<=n;i++){
            tmp = one + two;
            one = two;
            two = tmp;
        }
        return two;
    }
};

