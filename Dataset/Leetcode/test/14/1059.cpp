 class Solution {
public:
    string XXX(vector<string> &strs) {
        if (strs.empty()) return "";
        else if (strs.size() == 1) return strs.front();
        sort(strs.begin(), strs.end());
        string first = strs.front();
        string end = strs.back();
        int i;
        for (i = 0; i < first.size(); ++i) {
            if (first[i] != end[i]) break;
        }
        return first.substr(0, i);
    }
};

