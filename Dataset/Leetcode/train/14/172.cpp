 class Solution {
public:
    string XXX(vector<string>& strs) {
        if (strs.empty()) 
            return "";
        string res;
        string s = strs[0];
        for (int i = 0; i < s.size(); ++ i) {
            for (int j = 1; j < strs.size(); ++ j) {
                if (strs[j].size() < i + 1 || strs[j][i] != s[i])
                    return res;
            }
            res += s[i];
        }
        return res;
    }
};

