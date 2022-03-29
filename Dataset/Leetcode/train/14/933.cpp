 class Solution {
public:
    string XXX(vector<string>& strs) {
        string prefix = strs[0];
        for(vector<string>::iterator  iter = strs.begin()+1; iter != strs.end(); iter++) {
            int flag = 0;
            string res = "";
            for(int i = 0; i< (*iter).size(); i++) {
                if(prefix[i] != (*iter)[i]){
                    break;
                }
                res += (*iter)[i];
                flag = 1;
            }
            prefix = res;
            if(flag == 0) {
                return "";
            }
        }
        return prefix;
    }
};

