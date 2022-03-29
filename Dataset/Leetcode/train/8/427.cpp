 class Solution {
public:
    int XXX(string s) {
        auto i = s.begin();
        while (i < s.end() && *i == ' ') ++i;
        if (i == s.end()) return 0;
        int ans = 0;
        bool k = true;
        if (*i == '+' || *i == '-') {
            k = *i == '+';
            ++i;
        }
        while (*i == '0') ++i;
        while (i < s.end() && (*i <= '9' && *i >= '0')) {
            if (ans > 214748364 || ans == 214748364 && *i > '7') {
                return k ? INT_MAX : INT_MIN;
            }
            ans = ans * 10 + (*i - '0');
            ++i;
        }
        return k ? ans : -ans;
    }
};

