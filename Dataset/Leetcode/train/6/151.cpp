 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        string res("");
        int cur, add[2] = {numRows * 2 - 2, 0};
        for (int i = 0; i < numRows; ++i) {
            cur = i;
            int j = 0;
            while (cur < s.size()) {
                res.push_back(s[cur]);
                if (add[j] != 0) {
                    cur += add[j];
                    j = 1 - j;
                } else {
                    cur += add[1-j];
                }
            }
            add[0] -= 2;
            add[1] += 2;
        }
        return res;
    }
};

