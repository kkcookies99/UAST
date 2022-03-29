 class Solution {
public:
    string XXX(vector<string>& strs) {
        string prefix = strs.size() ? strs[0] : "";
        for (int idx = 0; idx < strs.size()&& !prefix.empty() && prefix != ""; idx++) {
            int pi = 0;
            for (; pi < prefix.size() && pi < strs[idx].size() && prefix[pi] == strs[idx][pi] ; pi++);
            prefix.resize(pi);
        }
        return prefix;
    }
};

