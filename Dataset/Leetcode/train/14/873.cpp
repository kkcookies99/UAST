 class Solution {
public:
    string XXX(vector<string>& strs) {
        string s;
        if(strs.size() == 1) return strs[0];
        int flag = 1;
        s = strs[0];
        string ans = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = 1; j < strs.size(); j++){
                if(s[i] != strs[j][i]){
                    flag = 0;
                }
            }
            if( !flag ) return ans;
            else ans += s[i];
        }
        if(flag == 1) return ans;
        else
            return "";
    }
};

