 class Solution {
public:
    string XXX(vector<string>& strs) {
        string ans;
        for (int i=0; i<strs[0].size(); i++) {
            int j = 0;
            for (j=0; j<strs.size()-1; j++) {
                if (i > strs[j].size() - 1) {
                    return ans;
                }
                if (strs[j][i] != strs[j+1][i]) {
                    return ans;
                }
            }
            ans += strs[j][i];
        }
        return ans;
    }
};

