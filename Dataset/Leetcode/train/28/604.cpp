 class Solution {
public:
    int XXX(string haystack, string needle) {
        if (needle == "") return 0;
        int n = haystack.size(),m = needle.size();
       vector<int>next(m + n + 1,0);
       string s = needle + "#" + haystack;
       for (int i = 1; i < s.size(); ++i) {
           int j = next[i - 1];
           while (j && s[i] != s[j]) j = next[j - 1];
           if (s[i] == s[j]) j++;
           next[i] = j;
           if (next[i] == m) return i - 2 * m;
       } 
        return -1;
    }
};

