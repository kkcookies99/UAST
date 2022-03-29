 class Solution {
public:
    int XXX(string s) {
        int start = 0;
        bool isNegative;
        start = stepOne(s, start);
        isNegative = stepTwo(s, start);
        return stepThree(s, start, isNegative);
    }

    int stepOne (string s, int start) {
        for (; start < s.size(); start++) {
            if (s[start] != ' ') break;
        }
        return start;
    }

    bool stepTwo (string s, int &start) {
        if (s[start] == '-' || s[start] == '+') {
            if (s[start++] == '-') {
                return true;
            }
        }
        return false;
    }

    int stepThree (string s, int index, bool isNegative) {
        long res = 0;
        for (; index < s.size(); index++) {
            if (s[index] < 48 || s[index] > 57) {
                break;
            } else {
                res = res*10 + (s[index] - 48);
                if (isNegative && -res < INT_MIN) return INT_MIN;
                else if (!isNegative && res > INT_MAX) return INT_MAX;
            }
        }
        return isNegative ? -res : res;
    }
};

