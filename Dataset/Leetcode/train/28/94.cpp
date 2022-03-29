 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.empty()) return 0;
        vector<int> ne(needle.size(), 0);
        for(int i = 1; i < needle.size(); ++i){
            int t = ne[i-1];
            while(t > 0 && needle[i] != needle[t])
                t = ne[t-1];
            if(needle[t] == needle[i])
                ne[i] = t + 1;
        }
        int i = 0, j = 0;
        for(; i < haystack.size() && j >= 0 && j < needle.size(); ++i){
            if(haystack[i] == needle[j]){
                j++;
            }
            else if(j > 0){
                j = ne[j-1];
                i--;
            }
        }
        if(j == needle.size()) return i - j;
        return -1;
    }
};

