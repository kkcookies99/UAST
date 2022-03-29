 class Solution {
public:
    bool XXX(string s) {
        string str ;
        for(int i = 0 ; i < s.length(); i ++){     

        if(s[i] >= 'a' && s[i] <= 'z' || s[i] >= '0' && s[i] <= '9' || s[i] >= 'A' && s[i] <= 'Z'){
                str += tolower(s[i]) ;
            }      
        }
        int len = str.length() ;
        for(int i = 0 ; i < len/2 ;i ++ ){
            if(str[i] != str[len-1-i]) return false ;
        }
        return true ;
    }
};

