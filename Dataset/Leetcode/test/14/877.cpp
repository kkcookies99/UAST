 class Solution {
public:
    string XXX(vector<string>& strs) {
        string prefix = strs[0];
        for (int i=1;i<strs.size();++i){
            prefix = CommonPrefix(prefix, strs[i]);
        }
        return prefix;
    }
    string CommonPrefix(string &s1, string &s2){
        if(s1 == "" || s2 == ""){
            return "";
        }
        int i = 0;
        while(i<s1.length() && i<s2.length()){
            if(s1.substr(0,i+1) == s2.substr(0,i+1)){
                i++;
            }
            else{
                return s1.substr(0,i);
            }
        }
        return s1.length() < s2.length() ? s1 : s2;
    }
};

