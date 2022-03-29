class Solution {
public:
    bool XXX(int x) {
        if(x < 0)
            return false;
        if(x == 0)
            return true;
        string str = to_string(x);
        for(size_t i = 0;i < str.size() - 1;++i)
        {
            if(str[i] != str[str.size()-i-1])
                return false;
        }
        return true;
    }
};

