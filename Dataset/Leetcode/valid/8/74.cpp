class Solution {
public:
    int XXX(string s) {
        int64_t Calc = strtol(s.c_str(),NULL,10);
        if(Calc > INT_MAX)
            Calc = INT_MAX;
        if(Calc < INT_MIN)
            Calc = INT_MIN;
        return Calc;
    }
};

