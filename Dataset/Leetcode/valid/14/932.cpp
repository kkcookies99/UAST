 class Solution {
public:
    string XXX(vector<string>& strs) {
        
        if (strs.size() == 0) {
            return "";
        }
        string result;
        string fisrtStr = strs[0];
        for (int i = 0; i < fisrtStr.length(); i++) {
            char s = fisrtStr[i];
            for (int j = 1; j < strs.size(); j++) {
                if(s == strs[j][i]){
                    continue;
                }else {
                    return result;
                }
            }
            result += s;
        }
        return result;
    }
};

