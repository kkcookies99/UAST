class Solution {
public:
    int XXX(int x) {
        bool f = false;
        if(x < 0) f = true;
        string res = to_string(abs(x));
        ::XXX(res.begin(), res.end());
        if(f) res = '-' + res;
        auto t = stol(res);
        if(t > pow(2, 31) - 1 || t < (-1) * pow(2, 31)) t = 0;
        return (int)t;
    }
};

