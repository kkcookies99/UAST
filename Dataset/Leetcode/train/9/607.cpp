 class Solution {
public:
    bool XXX(int x) {
        string s = to_string(x);
        int n = s.size();
        int m = n >> 1;
        for(int i = 0; i < m; ++i)
            if(s[i] != s[n - i - 1])
                return false;
        return true;
    }
};

