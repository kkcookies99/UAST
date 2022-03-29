 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.size()==0) return "";
        string res = strs[0];
        int n = strs.size();
        for(int i=1;i<n;i++){
            string temp;
            for(int j=0;j<res.size();j++){
                if(strs[i][j]==res[j])
                    temp += res[j];
                else 
                    break;
            }
            res = temp;
        }
        return res;
    }
};

