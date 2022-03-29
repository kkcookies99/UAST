 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.size() == 0) return "";
        string res = strs[0];
        for(int i = 1; i < strs.size(); ++i){
            string str = strs[i];
            int len = min(str.size(), res.size());
            string tmp = "";
            for(int j = 0; j < len; ++j){
                if(str[j] != res[j]){
                    res = tmp;
                    break;
                }else{
                    tmp += res[j];
                }
            }
            if(res.size() == 0) return "";
            res = tmp;
        }
        return res;
    }
};

