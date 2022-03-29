 class Solution {
public:
    string XXX(vector<string>& strs) {
        string str;
        int vecSize = strs.size();
        if(vecSize < 2) {
            return strs[0];
        }
        int minStr = INT_MAX;
        for(int i = 0; i < vecSize; ++i) {
            if(strs[i].size() < minStr) {
                minStr = strs[i].size();
            }
        }
        for(int i = 0; i < minStr; ++i) {
            for(int j = 0, k = vecSize - 1; j <= vecSize / 2; ++j, --k) {
                if(j == vecSize / 2) {
                    ++k;
                }
                if(strs[j][i] != strs[k][i]) {
                    return str;
                }
            }
            str += strs[0][i];
        }
        return str;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


