 class Solution {
public:
    string XXX(vector<string>& strs) {
        sort(strs.begin(), strs.end());
        string ans = "";
        for (int i = 0; i < strs[0].size() && i < strs.back().size(); i ++) {
            if (strs[0][i] == strs.back()[i]) ans += strs[0][i];
            else break;
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

