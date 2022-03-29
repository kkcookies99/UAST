 class Solution {
public:
    string XXX(vector<string>& strs) {
        // 纵向扫描
        string str = "";
        if(strs.empty()) return "";
        int i, j;
        for(i = 0; i < strs[0].size(); i++){
            for(j = 0; j < strs.size() - 1; j++){
                if(strs[j][i] != strs[j + 1][i]){
                    return str;;
                }
            }
            str += strs[j][i];
        }
        return str;
    }
};

