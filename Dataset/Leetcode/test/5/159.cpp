class Solution {
public:
    string XXX(string s) {
        int sLen = s.length();
        if(sLen == 0) return "";
        string res = "";
        vector < vector < bool>> f(sLen, vector<bool>(sLen, false));
        int maxLen = 0;
        int currLen = 0;
        
        for(int i = 0; i < sLen; i++){
            for(int j = 0; j <= i; j++){
                if((s[i] == s[j])&&((i-j < 2)||(i>0 && f[i-1][j+1]))){
                    f[i][j] = true;
                    currLen = i - j + 1;
                    if(currLen > maxLen){
                        maxLen = currLen;
                        res = s.substr(j, currLen);
                    }
                }
            }
        }
        return res;
    }
};


