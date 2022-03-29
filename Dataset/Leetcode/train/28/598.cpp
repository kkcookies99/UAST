 class Solution {
public:
    int XXX(string haystack, string needle) {
        int m = haystack.length();
        int n = needle.length();
        if(m < n) return -1;
        string_view s = haystack, t = needle;
        for(int i = 0; i + n <= m; i++){
            if(s.substr(i, n) == t) return i;
        }
        return -1;
    }
};

