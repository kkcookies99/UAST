class Solution {
public:
    int XXX(int n) {
        if(n < 2) return 1; //n是正整数，实际上并不会为0,之前有个题会有输入0
        if(n == 2) return 2;
        int one = 1,two = 2,res = 0;
        for(int i = 3;i <= n;i++)
        {
            res = one + two;
            one = two;
            two = res;
        }
        return res;
    }
};

