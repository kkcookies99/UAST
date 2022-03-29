 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.empty()) return 0;
        if(haystack.empty()) return -1;
        if(needle.length()>haystack.length()) return -1;
        int syboml = 0;
        for(int i =0;i<haystack.length()-needle.length()+1;i++){
            string temStr = haystack.substr(i,needle.length());
            syboml = 0;
            for(int j =0;j<needle.length();j++){
                if(temStr[j]!=needle[j]){
                    syboml = 1;
                    break;
                }
            }          
            if(syboml == 0)
                return i;
        }
        return -1;
    }
};

