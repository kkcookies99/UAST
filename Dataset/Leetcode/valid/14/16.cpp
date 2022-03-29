 class Solution {
public:
    string XXX(vector<string>& strs) {
        if (strs.size() <= 0) return "";
        if (strs.size() == 1) return strs[0];
        if (strs[0].size() == 0) return "";
        for (int index = 0;  ; index++){
            char ch=strs[0][index];
            for (int i = 0; i < strs.size(); i++) {
                if (strs[i].empty()) return "";
                if (ch != strs[i][index]) return strs[0].substr(0, index);
                if (strs[i].size() == index) return strs[i];
            }
        }
    }
};

