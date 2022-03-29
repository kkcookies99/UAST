 class Solution {
public:
    string XXX(vector<string>& strs) {
        int n = strs.size();
        int sizeFs = strs[0].size();
        string res = "";
        for(size_t i = 0;i<sizeFs;i++){
            char s = strs[0][i];
            for(size_t j =1;j<n;j++){
                if(strs[j][i]!=s){
                    return res;
                }
            }
            res+=s;
        }
        return res;

    }
};

