 class Solution {
public:
    int XXX(string haystack, string needle) {
    int len1 = haystack.size();
    int len2 = needle.size();
    if(len2 > len1) return -1;
    string s;
    for(int i=0;i<len1 -len2 + 1;i++){
        s = haystack.substr(i,len2);
        if(s == needle) return i;
    }
    return -1;
    }
};

