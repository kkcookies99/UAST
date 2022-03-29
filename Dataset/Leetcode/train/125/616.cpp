 class Solution {
public:
    bool XXX(string s) {
        char n;
        string s2,s3;
        for(int i = 0;i < s.length(); i++){
            n = s.c_str()[i];
            if(isalnum(n)) n = tolower(n);
            else continue;
            s2 += n;
        }
        for(int i = s2.length()-1;i >= 0;i--)
            s3 += s2.c_str()[i];
        if(s2 == s3) return true;
        else return false;
    }
};

