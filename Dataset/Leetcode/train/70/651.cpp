class Solution {
public:
    int res[46] = {0};
    int XXX(int n) {
        if(n == 1 || n == 2)  return n;
        if(!res[n])
            res[n] = XXX(n - 1) + XXX(n - 2);
        return res[n];
    }
};

