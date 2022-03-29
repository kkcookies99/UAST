 class Solution {
public:
    string XXX(vector<string>& strs) {
        if (strs.empty() || strs[0].empty())
            return "";
        if (strs.size() == 1)
            return strs[0];
        // 从头到尾遍历，直到不相等，返回前面相等的字符串
        for (int i = 0; ; ++i) {
            for (int j = 1; j < strs.size(); ++j) {
                if (strs[j].size() == i || strs[0].size() == i) // 字符串结尾
                    return strs[0].substr(0, i);
                if (strs[0][i] != strs[j][i]) // 字符不相等
                    return strs[0].substr(0, i);
            }
        }
        return "";
    }
};

