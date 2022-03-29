 class Solution {
public:
    bool XXX(string s) {
        if (s.size() % 2 != 0) {
            return false;
        }
        stack<int> stk;
        string str("({[]})");
        for (char c : s) {
            int i = 0;
            for (; i < 6; ++i) {
                if (c == str[i]) {
                    break;
                }
            }
            if (i < 3) {
                stk.push(i);
            } else {
                if (!stk.empty() && stk.top()+i == 5) {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }
        return stk.empty();
    }
};

