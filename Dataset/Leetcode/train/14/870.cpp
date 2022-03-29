 class Solution {
public:
    string XXX(vector<string>& strs) {
        string s = "";
        int n = strs.size();
        int m = strs[0].size();
        if(strs.size()==1) {
            if(strs[0].size()==0) return s;
            s+=strs[0][0];
            return s;
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n;j++){
                if(j > 0 && strs[j-1][i]==strs[j][i]){
                    if(j==n-1)  s+=strs[j][i];
                    continue;
                }
                else if(j > 0 && strs[j-1][i]!=strs[j][i]) return s;
            }
        }
        return s;
    }
};

