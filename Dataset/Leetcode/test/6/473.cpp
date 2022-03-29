 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows == 1) return s;
        vector<string> tab(numRows);
        int add = 1, idx = 0;
        for (const auto& c : s) {
            tab[idx].push_back(c);
            idx += add;
            if (idx == 0) add = 1;
            if (idx == numRows - 1) add = -1;
        }
        string ret;
        for (const auto& str : tab) {
            for (const auto& c : str) {
                ret.push_back(c);
            }
        }
        return ret;
    }
};

