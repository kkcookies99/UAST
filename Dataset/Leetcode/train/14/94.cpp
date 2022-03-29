 class Solution {
public:
    string XXX(vector<string>& strs) {
        string s;
        if(strs.empty()){
            return s;
        }
        int i=0,j,flag;
        for(auto c:strs[0]){
            for(j=1;j<strs.size();j++){
                string temp=strs[j];
                if(temp[i]!=c||i>=temp.size()){
                    return s;
                }
            }    
            s.push_back(c);
            ++i;
        }
        return s;
    }
};

