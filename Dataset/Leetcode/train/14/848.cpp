 class Solution {
public:
    string XXX(vector<string>& strs) {
        int n = strs[0].size();
        for (int i = 0; i < n; ++i) {
            for (const auto& s : strs) {
                if (i >= s.size() || s[i] != strs[0][i])
                    return s.substr(0, i);
            }
        }
        return strs[0].substr(0, n);
    }
};

