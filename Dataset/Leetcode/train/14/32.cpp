 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.empty()) return "";
        string res="";
        for(int i=0;i<strs[0].size();i++){
            for(int j=1;j<strs.size();j++){
                if(i==strs[j].length()||strs[0][i]!=strs[j][i]){
                    return res;
                }
            }
            res+=strs[0][i];
        }
        return res;
    }
};

