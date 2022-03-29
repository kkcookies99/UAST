 class Solution {
public:
    int XXX(string s) {
        int res = 0;
        int flag = 1;
        bool beg1 = false;
        bool beg2 = false;
        for (char c: s) {
            if (!beg1 && c == ' ')
                continue;
            if (!beg1 && c != ' ')
                beg1 = true;
            if (beg1 && !beg2) {
                beg2 = true;
                if (c == '-') {
                    flag = -1;
                    continue;
                }
                if (c == '+')
                    continue;
            }
            if (beg2) {
                if (c >= '0' && c <= '9') {
                    if (flag == 1) {
                        if ((INT_MAX - c + '0') / 10 >= res)
                            res = res * 10 + (c - '0') * flag;
                        else
                            return INT_MAX;
                    } else {
                        if ((INT_MIN + c - '0') / 10 <= res)
                            res = res * 10 - (c - '0');
                        else
                            return INT_MIN;
                    }
                } else
                    break;
            }
        }
        return res;
    }
};

