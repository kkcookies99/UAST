 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.empty())
            return "";
        int minSize = 0x7fffffff;
        string s = "";
        for(int i = 0; i < strs.size(); ++i){
            if(minSize > strs[i].size())
                minSize = strs[i].size();
        }
        int i,j; i = j = 0;
        for(j = 0; j < minSize; ++j){
            char c = strs[i][j];
            for(i = 0; i < strs.size(); ++i){
                if(c == strs[i][j]);
                else
                    break;
            }
            if(i == strs.size()){
                s.push_back(c);
                i = 0;
            }
            else   
                break;
        }
        return s;
    }
};

