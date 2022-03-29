 class Solution {
public:
    int XXX(string haystack, string needle) {
        if (needle.empty()) return 0;
        int ans = -1, k = -1;
        // kmp?时间复杂度O(m+n)
        vector<int> next(needle.size(), -1);
        for (int i = 1; i < needle.size(); i++){
            while (k != -1 && needle[k+1] != needle[i]) k = next[k];
            if (needle[i] == needle[k+1]) k++;
            next[i] = k;
        }
        k = -1;
        for (int i = 0; i < haystack.size(); i++){
            while (k != -1 && haystack[i] != needle[k+1]) k = next[k];
            if (haystack[i] == needle[k+1]) k++;
            if (k == needle.size()-1) return i-needle.size()+1;
        }
        return -1;
    }
};

