 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        for (int i = 0; i < n; ++i) {
            if (0 == res.size()) {
                res.push_back("()");
            } else {
                vector<string> temp;
                for (int j = 0; j < res.size(); ++j) {
                    for (int k = 0; k < res[j].length(); ++k) {
                        string newStr = res[j].substr(0, k+1) + "()" + res[j].substr(k+1);
                        // 判断temp中是否存在该字符串
                        int flag = 1;
                        for (int l = 0; l < temp.size(); ++l) {
                            if (temp[l] == newStr) {flag = 0; break;}
                        }
                        if (flag) temp.push_back(newStr);
                    }
                }
                res = temp;
            }
        }
        return res;
    }
};

