 class Solution {
public:
    string XXX(vector<string>& strs) {
        if (strs.size() == 0)
            return string();
        if (strs.size() == 1)
            return strs[0];
        
        unsigned int len = -1;
        int num = strs.size();
        for (auto i : strs) {
            if (i.size() < len)
                len = i.size();
        }
        for (int i = 0; i < len; i++)
            for (int j = 1; j < num; ++j) {
                if (strs[0][i] != strs[j][i])
                    return string(strs[0].begin(), strs[0].begin() + i);
            }
        return string(strs[0].begin(), strs[0].begin() + len);
    }
};

