 class Solution {
public:
    string XXX(vector<string>& strs) {
        string ans = "";
        if(strs.size() == 0)
            return ans;
        
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.size();j++){
                if(strs[j].length() <= i)
                    return ans;
                if(strs[j][i] != strs[0][i])
                    return ans;
            }
            ans += strs[0][i];
        }
        return ans;
    }

};

