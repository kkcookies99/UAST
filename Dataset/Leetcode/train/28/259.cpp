 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.empty()) return 0;
        for(int i = 0;i < haystack.size();i++){
            if(haystack[i] == needle[0]&&
            haystack.substr(i,needle.size()) == needle)
                return i;
        }
        return -1;
    }
};

