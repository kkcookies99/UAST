 class Solution {
public:
    int XXX(string haystack, string needle) {
        if (needle.length() == 0) return 0;
        for(int i = 0; i <= int(haystack.length()) - int(needle.length()) + 1; ++i) {
            for (int j = 0; (j < int(needle.length())) && (needle[j] == haystack[i + j]); ++j) { 
                if (j == needle.length() - 1) return i;
            } 
        }
        return -1;
    }
};

