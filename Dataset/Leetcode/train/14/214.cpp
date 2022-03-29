 class Solution {
public:
    string XXX(vector<string>& strs) {
        if (strs.size() == 0) return "";
        string str = "";
        for (int i = 0; i < strs[0].size(); i ++) {
            int flag = 1;
            for (int j = 1; j < strs.size(); j++) {
                if (strs[0][i] != strs[j][i]) {
                    return str;
                }
            }
            if (flag) {
                char c = strs[0][i];
                str += c;
            }
        }
        return str;
    }
};

