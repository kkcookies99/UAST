 class Solution {
public:
    string XXX(vector<string>& strs) {
        int n = strs.size();
        int i = 0;
        while (1) {
            if (i >= strs[0].size()) {
                return strs[0];
            }
            char cur = strs[0][i];
            for (auto& s : strs) {
                if (s.size() <= i || s[i] != cur) {
                    return s.substr(0, i);
                }
            }
            ++i;
        }
    }
};

