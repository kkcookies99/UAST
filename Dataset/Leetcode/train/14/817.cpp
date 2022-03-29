 class Solution {
public:
    string XXX(vector<string>& strs) {
        if (strs.size() == 0) return "";
        else if (strs.size() == 1) return strs[0];
        else if (strs.size() == 2) {
            int i = 0, j = 0;
            string res;
            while (i < strs[0].size() && j < strs[1].size()) {
                if (strs[0][i] == strs[1][j]) {
                    res.push_back(strs[0][i]);
                    i++;
                    j++;
                }
                else return res;
            }
            return res;
        }
        else {
            vector<string> str1, str2;
            str1.assign(strs.begin(), strs.begin() + strs.size() / 2);
            str2.assign(strs.begin() + strs.size() / 2 , strs.end());
            string res1 = this->XXX(str1);
            string res2 = this->XXX(str2);
            int i = 0, j = 0;
            string res;
            while (i < res1.size() && j < res2.size()) {
                if (res1[i] == res2[j]) {
                    res.push_back(res1[i]);
                    i++;
                    j++;
                }
                else return res;
            }
            return res;
        }
    }
};

