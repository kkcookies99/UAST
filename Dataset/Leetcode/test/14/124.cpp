 class Solution {
public:
    string XXX(vector<string>& strs) {
        int min_size = strs[0].size();
        string ans = "";
        for (int i = 0; i < strs.size(); i++) {
            if (strs[i] == "") return ans;
            if (strs[0][0] != strs[i][0]) return ans;
            min_size = min_size < strs[i].size() ? min_size : strs[i].size();  
        }
        ans += strs[0][0];
        for (int j = 1; j < min_size; j++) {
            for (int k = 0; k < strs.size(); k++) {
                if (strs[0][j] != strs[k][j]) return ans;
            }
            ans += strs[0][j];
        }
        return ans;
    }
};

