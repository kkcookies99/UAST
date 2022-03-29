class Solution {
public:
    int XXX(string s) {
        string max = "2147483647";
        string min = "2147483648";
        int len = s.size();
        string ret = "";
        int sign = 1, i = 0;
        bool is_first_sign = true;
        bool is_head_space = true;
        bool is_head_zeros = true;
        while (((s[i] >= '0' && s[i] <= '9') || s[i] == ' ' || s[i] == '-' || s[i] == '+') && (i != len)) {
            if (s[i] == ' ') {
                if (!is_head_space) {
                    break;
                }
            }
            else if (s[i] == '-' || s[i] == '+') {
                if (is_first_sign) {
                    if (s[i] == '-')
                        sign = -1;
                    is_first_sign = false;
                }
                else {
                    break;
                }
                is_head_space = false;
            }
            else if (s[i] >= '0' && s[i] <= '9') {
                
                if (s[i] == '0') {
                    if (!is_head_zeros) {
                        ret += s[i];
                    }
                }
                else {
                    ret += s[i];
                    is_head_zeros = false;
                }
                is_head_space = false;
                is_first_sign = false;
            }
            else {
                break;
            }
            i++;
        }
        if (ret == "") {
            return 0;
        }
        if (sign == 1) {
            if (ret.size() < max.size()) {
                return stoi(ret);
            }
            else if (ret.size() == max.size()) {
                if (ret < max) {
                    return stoi(ret);
                }
                else {
                    return INT_MAX;
                }
            }
            else {
                return INT_MAX;
            }
        }
        else {
            if (ret.size() < min.size()) {
                return -1 * stoi(ret);
            }
            else if (ret.size() == min.size()) {
                if (ret < min) {
                    return -1 * stoi(ret);
                }
                else {
                    return INT_MIN;
                }
            }
            else {
                return INT_MIN;
            }
        }
    }
};

