 class Solution {
public:
    int XXX(string s) {
        int i = 0;
        while (i < s.size() && s[i] == ' ') {
            i++;
        }
        bool positive = true;
        if (i < s.size() && s[i] == '+') {
            i++;
        } else if (i < s.size() && s[i] == '-') {
            positive = false;
            i++;
        }
        int res = 0;
        while (i < s.size()) {
            if (s[i] < '0' || s[i] >'9') {
                return positive ? res : -res;
            }
            if (res > INT_MAX / 10) {
                return positive ? INT_MAX : INT_MIN;
            } else if (res < INT_MAX / 10) {
                res *= 10;
                res += s[i] - '0';
            } else {
                if (positive && s[i] >= '7') {
                    return INT_MAX;
                } else if (!positive && s[i] >= '8') {
                    return INT_MIN;
                } else {
                    res *= 10;
                    res += s[i] - '0';
                }
            }
            i++;
        }
        return positive ? res : -res;
    }
};

