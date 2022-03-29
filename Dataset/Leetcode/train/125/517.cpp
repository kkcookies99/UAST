 class Solution {
public:
    bool XXX(string s) {
        if(s.empty()) return true;
        string S = "";
        //预处理
        for(char c : s){
            if(c >= '0' && c <= '9') S.push_back(c);
            else if(c >= 'a' && c <= 'z') S.push_back(c);
            else if(c >= 'A' && c <= 'Z') 
                S.push_back(c - 'A' + 'a');
        } 

        int i = 0,j = S.size() - 1;
        while(i < j){
            if(S[i++] != S[j--]) return false;
        }
        return true;
    }
};

