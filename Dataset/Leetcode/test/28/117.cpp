 class Solution {
public:
    int XXX(string haystack, string needle) {
        int hlen = haystack.size(), nlen = needle.size();
        if(!nlen) return 0;
        if(!hlen && nlen) return -1;
        for(int i = 0; i < hlen; i++)
            if(haystack[i] == needle[0] && (i+nlen) <= hlen && !haystack.substr(i, nlen).compare(needle))
                return i;
        return -1;
    }
};

