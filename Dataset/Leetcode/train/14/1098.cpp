 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.size()==0) return "";
        string str = strs[0];
        int k,i;
        for(k=0;k<str.length();++k){
            for(i=0;i<strs.size();++i) if(str[k]!=strs[i][k]) break;
            if(i<strs.size()) break;
        }
        return str.substr(0,k);
    }
};

