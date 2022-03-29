 class Solution {
public:
    int XXX(string s) {
        long long ret_ans = 0;
        bool begin_flag = false, fu_flag = false;
        for (size_t i = 0; i < s.length(); ++i) {
            if ((s[i] >= '0' && s[i] <= '9')) {
                begin_flag = true;
                ret_ans = ret_ans * 10 + s[i] - '0';
                if (ret_ans >= INT_MAX && !fu_flag) {
                    return INT_MAX;
                } else if (ret_ans >= -(long long)INT_MIN) {
                    return INT_MIN;
                }
            } else if (!begin_flag && s[i] == ' ') {
                continue;
            } else if (!begin_flag && (s[i] == '-' || s[i] == '+')) {
                begin_flag = true;
                fu_flag = s[i] == '-' ? true : false;
            } else {
                break;
            }
        }
        return fu_flag ? -ret_ans : ret_ans;
    }
};

