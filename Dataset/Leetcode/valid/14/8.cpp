 class Solution {
public:
    string XXX(vector<string>& strs) {
        sort(strs.begin(), strs.end());
        string str = "";
        if (strs.size() == 1) {
            return strs[0];
        }
        for (unsigned int i = 0; i < strs[0].size(); ++i) {
            char ch = strs[0][i];
            bool isAdd = true;
//            printf("ch:%c i:%d\n", ch, i);
            for (unsigned int j = 1; j < strs.size(); ++j) {
                if (i >= strs[j].size()) {
                    isAdd = false;
                    break;
                }
                if (strs[j][i] != ch) {
                    isAdd = false;
                    break;
                }
            }
            if (!isAdd) {
                break;
            }
//            printf("str:%s\n", str.c_str());
            str.push_back(ch);
        }
        return str;
    }
};

