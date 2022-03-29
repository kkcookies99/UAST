class Solution {
public:
    int XXX(int x) {
        string Num = to_string(abs(x));
        std::XXX(Num.begin(),Num.end());
        int64_t Result = strtol(Num.c_str(),NULL,10);
        if(Result > INT_MAX)
            Result = 0;
        x < 0 ? Result *= -1 : Result *= 1;
        return Result;
    }
};

