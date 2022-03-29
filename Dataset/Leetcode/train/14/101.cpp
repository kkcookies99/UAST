 class Solution {
public:
    string cp(string s1, string s2) {
        int i = 0;
        while (i<s1.size()&&i<s2.size()) {
            if(s1[i]!=s2[i]) break;
            i++;
        }
        return s1.substr(0,i);
    }
    string XXX(vector<string>& strs) {
        if (strs.size()==0) return "";
        if (strs.size()==1) return strs[0];
        
        string res = cp(strs[0], strs[1]);
        for(int i = 2 ; i <strs.size() ; i++) {
            res = cp(res, strs[i]);
        }
        return res;
    }
};```

