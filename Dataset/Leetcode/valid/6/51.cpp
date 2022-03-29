 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        string res;
        res.reserve(s.size());
        int k = 2 * numRows - 2;
        for (int i = 0; i < s.size(); i += k) {
            res.push_back(s[i]);
        }
        for (int i = 1; i < numRows - 1; ++i) {
            for (int j = 0; j < s.size(); j += k) {
                if (j + i < s.size())
                    res.push_back(s[j + i]);
                if (j + k - i < s.size())
                    res.push_back(s[j + k - i]);
            }

        }
        for (int i = numRows - 1; i < s.size(); i += k) {
            res.push_back(s[i]);
        }
        return res;
    }
};

